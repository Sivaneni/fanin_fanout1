package com.aw.common.compress;
import java.io.Serializable;

import com.aw.common.AppConstants;
import com.aw.common.AppConstants.R1_Constants;
public class IQAttachmentTO implements Serializable {
    private static final long serialVersionUID = -7239530357621632766L;
    private byte[] attachment;
    private String compressed;
    private String description;
    private String fileId;
    private String fileName;
    private String fileSize;
    private String fileType;
    private String iQOrderHeaderKey;
    private String orderHeaderKey;
    private String orderId;
    private String ottOrderId;
    private String userName;
    private int attachmentId;
    private String xmlOrdered = AppConstants.R1_Constants.ZERO;
    public byte[] getAttachment() {
        return attachment;
    }
    public String getCompressed() {
        return compressed;
    }
    public String getDescription() {
        return description;
    }
    public String getFileId() {
        return fileId;
    }
    public String getFileName() {
        return fileName;
    }
    public String getFileSize() {
        return fileSize;
    }
    public String getFileType() {
        return fileType;
    }
    public String getIQOrderHeaderKey() {
        return iQOrderHeaderKey;
    }
    public String getOrderHeaderKey() {
        return orderHeaderKey;
    }
    public String getOrderId() {
        return orderId;
    }
    public String getOttOrderId() {
        return ottOrderId;
    }
    public String getUserName() {
        return userName;
    }
    public String getXmlOrdered() {
        return xmlOrdered;
    }
    public void setAttachment(byte[] attachment) {
        this.attachment = attachment;
    }
    public void setCompressed(String compressed) {
        this.compressed = compressed;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
    public void setIQOrderHeaderKey(String orderHeaderKey) {
        iQOrderHeaderKey = orderHeaderKey;
    }
    public void setOrderHeaderKey(String orderHeaderKey) {
        this.orderHeaderKey = orderHeaderKey;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public void setOttOrderId(String ottOrderId) {
        this.ottOrderId = ottOrderId;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setXmlOrdered(String xmlOrdered) {
        this.xmlOrdered = xmlOrdered;
    }
    public int getAttachmentId() {
		return attachmentId;
	}
	public void setAttachmentId(int attachmentId) {
		this.attachmentId = attachmentId;
	}
	public String toString() {
        StringBuffer buffer = new StringBuffer(R1_Constants.NEWLINE);
        buffer.append(" IQAttachmentTO:" + R1_Constants.NEWLINE);
        buffer.append("   attachment = [" + attachment + "]" + R1_Constants.NEWLINE);
        buffer.append("   compressed = [" + compressed + "]" + R1_Constants.NEWLINE);
        buffer.append("   description = [" + description + "]" + R1_Constants.NEWLINE);
        buffer.append("   fileId = [" + fileId + "]" + R1_Constants.NEWLINE);
        buffer.append("   fileName = [" + fileName + "]" + R1_Constants.NEWLINE);
        buffer.append("   fileSize = [" + fileSize + "]" + R1_Constants.NEWLINE);
        buffer.append("   fileType = [" + fileType + "]" + R1_Constants.NEWLINE);
        buffer.append("   iQOrderHeaderKey = [" + iQOrderHeaderKey + "]" + R1_Constants.NEWLINE);
        buffer.append("   orderHeaderKey = [" + orderHeaderKey + "]" + R1_Constants.NEWLINE);
        buffer.append("   orderId = [" + orderId + "]" + R1_Constants.NEWLINE);
        buffer.append("   ottOrderId = [" + ottOrderId + "]" + R1_Constants.NEWLINE);
        buffer.append("   userName = [" + userName + "]" + R1_Constants.NEWLINE);
        buffer.append("   xmlOrdered = [" + xmlOrdered + "]" + R1_Constants.NEWLINE);
        buffer.append("   attachmentId = [" + attachmentId + "]" + R1_Constants.NEWLINE);
        return buffer.toString();
    }
}
