package com.aw.common.compress;
//import org.apache.commons.lang.StringUtils;
//import org.apache.commons.lang.Validate;

import com.aw.common.AppConstants;
import com.aw.wps.util.logging.AWLogger;
public class FileCompressor {
    //private static final String DRIVE_PREFIX = "c:\\";
    private static final String ZIP_EXTENSION = ".zip";
    private byte[] compressedBytes;
    private String compressedFileName;
    private int compressedFileSize;
    private byte[] originalBytes;
    private String originalFileName;
    private int originalFileSize;
    public FileCompressor(byte[] originalBytes, String originalFileName) {
        super();
        //Validate.notEmpty(originalFileName);
       // Validate.notNull(originalBytes);
       // Validate.isTrue(originalBytes.length > 0);
        this.originalBytes = originalBytes;
        //this.originalFileName = StringUtils.replace(originalFileName, DRIVE_PREFIX, "");
        //this.originalFileName = originalFileName.replaceAll(DRIVE_PREFIX, "");
        this.originalFileName = originalFileName;
        this.originalFileSize = originalBytes.length;
        compressFile();
    }
    private void compressFile() {
        boolean useOriginalAsCompressedFile = true;
        // If this is a ZIP file we are going to assume it is already compressed and use the original information as the compressed information.
        if (!CompressionUtils.isZipFileExtension(getOriginalFileName())) {
            try {
                byte[] compressedBytes = CompressionUtils.zipBytes(getOriginalBytes(), getOriginalFileName());
                if (compressedBytes.length > 0) {
                    useOriginalAsCompressedFile = false;
                    setCompressedBytes(compressedBytes);
                    setCompressedFileSize(compressedBytes.length);
                    setCompressedFileName(getOriginalFileName() + ZIP_EXTENSION);
                }
            } catch (Exception anException) {
                //AWLogger.logError("FileCompresssor >> compressFile : Unable to compress file [" + getOriginalFileName() + "] going to use original file.");
            	AWLogger.logSimpleMessage("FileCompresssor", "Unable to compress file [" + getOriginalFileName() + "] going to use original file.", "compressFile", "ERROR");
            }
        }
        if (useOriginalAsCompressedFile) {
            setCompressedBytes(getOriginalBytes());
            setCompressedFileSize(getOriginalFileSize());
            setCompressedFileName(getOriginalFileName());
        }
        // writeFiles(); UNCOMMENT TO CHECK THE SIZE OF COMPRESSED FILES, AS NEEDED
        //AWLogger.logDebug("FileCompressor >> compressFile : [" + this.toString() + "]");
        AWLogger.logSimpleMessage("FileCompresssor", this.toString(), "compressFile", "INFO");
    }
    public byte[] getCompressedBytes() {
        return compressedBytes;
    }
    public String getCompressedFileName() {
        return compressedFileName;
    }
    public int getCompressedFileSize() {
        return compressedFileSize;
    }
    public byte[] getOriginalBytes() {
        return originalBytes;
    }
    public String getOriginalFileName() {
        return originalFileName;
    }
    public int getOriginalFileSize() {
        return originalFileSize;
    }
    public boolean isCompressed() {
        return CompressionUtils.isZipFileExtension(getCompressedFileName());
    }
    public void setCompressedBytes(byte[] compressedBytes) {
        this.compressedBytes = compressedBytes;
    }
    public void setCompressedFileName(String compressedFileName) {
        this.compressedFileName = compressedFileName;
    }
    public void setCompressedFileSize(int compressedFileSize) {
        this.compressedFileSize = compressedFileSize;
    }
    public void setOriginalBytes(byte[] originalBytes) {
        this.originalBytes = originalBytes;
    }
    public void setOriginalFileName(String originalFileName) {
        this.originalFileName = originalFileName;
    }
    public void setOriginalFileSize(int originalFileSize) {
        this.originalFileSize = originalFileSize;
    }
    public String toString() {
        StringBuilder builder = new StringBuilder(AppConstants.R1_Constants.NEWLINE);
        builder.append(" FileCompressor:" + AppConstants.R1_Constants.NEWLINE);
        builder.append("   Original File Name = [" + originalFileName + "]" + AppConstants.R1_Constants.NEWLINE);
        builder.append("   Orignial File Size = [" + originalFileSize + "]" + AppConstants.R1_Constants.NEWLINE);
        builder.append("   Compressed File Name = [" + compressedFileName + "]" + AppConstants.R1_Constants.NEWLINE);
        builder.append("   Compressed File Size = [" + compressedFileSize + "]" + AppConstants.R1_Constants.NEWLINE);
        builder.append("   Is Compressed ? = [" + isCompressed() + "]" + AppConstants.R1_Constants.NEWLINE);
        return builder.toString();
    }
    private void writeFiles() {
        try {
            String BASE_DIRECTORY = "/usr/transfer/from_iq_order_submit/";
            CompressionUtils.writeFile(BASE_DIRECTORY + getOriginalFileName(), getOriginalBytes());
            CompressionUtils.writeFile(BASE_DIRECTORY + getCompressedFileName(), getCompressedBytes());
        } catch (Exception anException) {
            //AWLogger.logError("FileCompresssor >> compressFile : Unable to write file due to the following exception: ", anException);
        	AWLogger.logSimpleMessage("FileCompresssor", "Unable to write file due to the following exception: "+ anException, "compressFile", "ERROR");
        }
    }
}
