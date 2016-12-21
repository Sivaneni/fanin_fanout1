package com.aw.databinding;

import com.aw.wps.util.logging.LoggingUtil;
import com.ibm.j2ca.extension.emd.runtime.internal.DataBindingUtil;
import com.ibm.j2ca.ftp.emd.runtime.FTPFileBaseDataBinding;
import commonj.connector.runtime.DataBindingException;
import commonj.sdo.DataObject;

@SuppressWarnings("serial")
public class AWFTPFileBaseDataBinding extends FTPFileBaseDataBinding {
	String XML_INST = "<?xml version='1.0' encoding='UTF-8'?>";
	@Override
	public void setDataObject(DataObject input) throws DataBindingException{
		DataObject currentObj = input.getDataObject("Content");
		if(currentObj != null){
			String dataXML = LoggingUtil.getDataObjectFormatXml(currentObj);
			if(dataXML != null){
				dataXML = XML_INST + dataXML;
			}
			DataObject newObj = createUnstructuredContentDataObject();
			newObj.setString("AsText", dataXML);
			input.setDataObject("Content", newObj);
		}
		super.setDataObject(input);
	}
	
	private DataObject createUnstructuredContentDataObject() throws DataBindingException{
		DataObject unstructuredContentDataObject = null;
		try{
			unstructuredContentDataObject = DataBindingUtil.createDataObject("http://www.ibm.com/xmlns/prod/websphere/j2ca/base/unstructuredcontent", "UnstructuredContent");
		}catch(Exception e){
			throw new DataBindingException("Error while creating UnstructuredContentDataObject", e);
		}
		return unstructuredContentDataObject;
	}
}
