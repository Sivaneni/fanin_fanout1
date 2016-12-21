package com.aw.common.compress;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.CheckedOutputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

//import org.apache.commons.lang.StringUtils;

import com.aw.wps.util.logging.AWLogger;
public class CompressionUtils extends Object {
    /**
     * Byte array compressed in the Zip format from bytes.
     * 
     * @param bytes
     *            a byte array
     * @return byte[] compressed bytes
     * @throws IOException
     */
    public static byte[] compress(byte[] bytes) throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        CheckedOutputStream csum = new CheckedOutputStream(bos, new CRC32());
        ZipOutputStream out = new ZipOutputStream(csum);
        out.putNextEntry(new ZipEntry("temp"));
        while ((in.read()) != -1) {
            out.write(bytes, 0, bytes.length);
        }
        in.close();
        byte[] compressedData = bos.toByteArray();
        // printing a checksum calculated with CRC32
        //if (AWLogger.isDebugEnabled())
            //AWLogger.logDebug("[CompressionUtils:processAsZip] - compress: " + csum.getChecksum().getValue());
            AWLogger.logSimpleMessage("CompressionUtils", String.valueOf(csum.getChecksum().getValue()), "compress", "DEBUG");
        return compressedData;
    }
    /**
     * Byte array that has been decompressed from the Zip format.
     * 
     * @param bytes
     *            a byte array of compressed bytes
     * @return byte[] uncompressed bytes
     * 
     */
    public static byte[] decompress(byte[] binaryBuffer) {
        // Create the decompressor and give it the data to compress
        Inflater decompressor = new Inflater();
        decompressor.setInput(binaryBuffer);
        // Create an expandable byte array to hold the decompressed data
        ByteArrayOutputStream bos = new ByteArrayOutputStream(binaryBuffer.length);
        // Decompress the data
        byte[] buf = new byte[1024];
        while (!decompressor.finished()) {
            try {
                int count = decompressor.inflate(buf);
                bos.write(buf, 0, count);
            } catch (DataFormatException e) {
                AWLogger.logSimpleMessage("CompressionUtils", "DataFormatException"+e, "decompress", "ERROR");
            }
        }
        try {
            bos.close();
        } catch (IOException e) {
            //AWLogger.logError("[CompressionUtils:decompress:] - IOException", e);
            AWLogger.logSimpleMessage("CompressionUtils", "IOException"+e, "decompress", "ERROR");
        }
        // Get the decompressed data
        byte[] decompressedData = bos.toByteArray();
        return decompressedData;
    }
    public static boolean isZipFileExtension(String fileName) {
        boolean isZipFile = false;
       // if (StringUtils.isNotBlank(fileName)) {
        if (fileName != null && fileName.length() > 0) {
            isZipFile = fileName.toLowerCase().endsWith(".zip");
        }
        return isZipFile;
    }
    /**
     * Byte array compressed in the Zip format from bytes.
     * 
     * @param bytes
     *            a byte array
     * @return byte[] compressed bytes
     * 
     */
    public static byte[] processAsZip(byte[] input) {
        // Compressor with highest level of compression
        Deflater compressor = new Deflater();
        compressor.setLevel(9);
        // Give the compressor the data to compress
        compressor.setInput(input);
        compressor.finish();
        // Create an expandable byte array to hold the compressed data.
        // It is not necessary that the compressed data will be smaller than
        // the uncompressed data.
        ByteArrayOutputStream bos = new ByteArrayOutputStream(input.length);
        // Compress the data
        byte[] buf = new byte[input.length];
        while (!compressor.finished()) {
            int count = compressor.deflate(buf);
            bos.write(buf, 0, count);
        }
        try {
            bos.close();
        } catch (IOException e) {
            //AWLogger.logError("[CompressionUtils:processAsZip] - IOException", e);
        	AWLogger.logSimpleMessage("CompressionUtils", "IOException"+e, "processAsZip", "ERROR");
        }
        // Get the compressed data
        byte[] compressedData = bos.toByteArray();
        // Set the compressed data into IQAttachmentTO
        return compressedData;
    }
    /**
     * Byte array compressed in the Zip format from bytes.
     * 
     * @param bytes
     *            a byte array
     * @return byte[] compressed bytes
     * @throws IOException
     */
    public static byte[] processAttachmentAsZip(byte[] bytes) throws IOException {
        byte[] tempBytes = null;
        ByteArrayOutputStream tempOStream = new ByteArrayOutputStream(bytes.length);
        ZipOutputStream tempZStream = new ZipOutputStream(tempOStream);
        // Compress the data
        CRC32 tempCRC = new CRC32();
        tempCRC.reset();
        tempCRC.update(bytes);
        ZipEntry tempEntry = new ZipEntry("temp");
        tempEntry.setTime(System.currentTimeMillis());
        tempEntry.setSize(bytes.length);
        tempEntry.setCrc(tempCRC.getValue());
        tempZStream.setLevel(8);
        tempZStream.putNextEntry(tempEntry);
        tempZStream.write(bytes, 0, bytes.length);
        tempZStream.flush();
        tempZStream.finish();
        tempBytes = tempOStream.toByteArray();
        tempZStream.close();
        return tempBytes;
    }
    /**
     * Byte array that has been decompressed from the Zip format.
     * 
     * @param bytes
     *            a byte array of compressed bytes
     * @return byte[] uncompressed bytes
     * @throws IOException
     */
    public static byte[] processUnzip(byte[] bytes) throws IOException, ClassNotFoundException {
        ByteArrayInputStream tempIStream = new ByteArrayInputStream(bytes);
        CheckedInputStream csumi = new CheckedInputStream(tempIStream, new CRC32());
        ByteArrayOutputStream bos = new ByteArrayOutputStream(bytes.length);
        ZipInputStream in2 = new ZipInputStream(new BufferedInputStream(csumi));
        ZipEntry ze;
        while ((ze = in2.getNextEntry()) != null) {
            //if (AWLogger.isDebugEnabled())
                //AWLogger.logDebug("[CompressionUtils:processUnzip:] - Extracting file : " + ze);
        		AWLogger.logSimpleMessage("CompressionUtils", "Extracting file :"+ze, "processUnzip", "DEBUG");
                
            int x;
            while ((x = in2.read()) != -1)
                bos.write(x);
        }
        in2.close();
        //if (AWLogger.isDebugEnabled())
            //AWLogger.logDebug("[CompressionUtils:processUnzip:] - Checksum extracted: " + csumi.getChecksum().getValue());
            AWLogger.logSimpleMessage("CompressionUtils", "Checksum extracted: " + csumi.getChecksum().getValue(), "processUnzip", "DEBUG");
        return bos.toByteArray();
    }
    /**
     * Byte array that has been decompressed from the Zip format.
     * 
     * @param bytes
     *            a byte array of compressed bytes
     * @return byte[] uncompressed bytes
     * @throws IOException
     */
    public static byte[] unzipBytes(byte[] bytes) throws IOException {
        ByteArrayInputStream tempIStream = null;
        BufferedInputStream tempBIStream = null;
        ZipInputStream tempZIStream = null;
        // byte[] tempBytes = null;
        ZipEntry tempEntry = null;
        long tempDecompressedSize = -1;
        byte[] tempUncompressedBuf = null;
        tempIStream = new ByteArrayInputStream(bytes, 0, bytes.length);
        tempBIStream = new BufferedInputStream(tempIStream);
        tempZIStream = new ZipInputStream(tempBIStream);
        tempEntry = tempZIStream.getNextEntry();
        if (tempEntry != null) {
            tempDecompressedSize = tempEntry.getSize();
            tempUncompressedBuf = new byte[(int) tempDecompressedSize];
            tempZIStream.read(tempUncompressedBuf);
        }
        tempZIStream.close();
        return tempUncompressedBuf;
    }
    public static void writeFile(String fileName, byte[] fileContents) {
        try {
            File aFile = new File(fileName);
            Writer output = new BufferedWriter(new FileWriter(aFile));
            output.write(new String(fileContents));
            output.flush();
            output.close();
        } catch (Exception anException) {
            //AWLogger.logError("CompressionUtils >> writeFile : Unable to write file [" + fileName + "] due to the following exception: ", anException);
        	AWLogger.logSimpleMessage("CompressionUtils", "Unable to write file [" + fileName + "] due to the following exception: "+ anException, "processUnzip", "ERROR");
        }
    }
    /**
     * Byte array compressed in the Zip format from bytes.
     * 
     * @param bytes
     *            a byte array
     * @return byte[] compressed bytes
     * @throws IOException
     */
    public static byte[] zipBytes(byte[] bytes, String filename) throws IOException {
        ByteArrayOutputStream tempOStream = null;
        BufferedOutputStream tempBOStream = null;
        ZipOutputStream tempZStream = null;
        ZipEntry tempEntry = null;
        byte[] tempBytes = null;
        CRC32 tempCRC = null;
        tempOStream = new ByteArrayOutputStream(bytes.length);
        tempBOStream = new BufferedOutputStream(tempOStream);
        tempZStream = new ZipOutputStream(tempBOStream);
        tempCRC = new CRC32();
        tempCRC.update(bytes, 0, bytes.length);
        tempEntry = new ZipEntry(filename);
        tempEntry.setMethod(ZipEntry.STORED);
        tempEntry.setSize(bytes.length);
        tempEntry.setCrc(tempCRC.getValue());
        tempZStream.putNextEntry(tempEntry);
        tempZStream.write(bytes, 0, bytes.length);
        tempZStream.flush();
        tempBytes = tempOStream.toByteArray();
        tempZStream.close();
        return tempBytes;
    }
}
