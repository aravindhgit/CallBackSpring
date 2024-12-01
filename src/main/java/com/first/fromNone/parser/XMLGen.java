package com.first.fromNone.parser;


public class XMLGen {

//	public static String getODConnectInput(String cabinetName, String userName, String password) {
//		return "<?xml version=\"1.0\"?>\n<NGOConnectCabinetForceFully_Input>\n<Option>NGOConnectCabinet</Option>\n<UserExist>N</UserExist>\n<CabinetName>"
//				+ cabinetName + "</CabinetName>\n" + "<UserName>" + userName + "</UserName>\n" + "<UserPassword>"
//				+ password + "</UserPassword>\n" + "</NGOConnectCabinetForceFully_Input>";
//	}
//
//	public static String getNGOAddDocumentInput(String cabinetName, String sessionID, String searchFolderId,
//			String docName, String filepath, String docExt, String docIndex, String processDefId, String strcomments,
//			int pageCount, long docSize, int volID) {
//		return "<?xml version=\"1.0\"?>\n<NGOAddDocument_Input>\n<Option>NGOAddDocument</Option>\n<CabinetName>"
//				+ cabinetName + "</CabinetName>\n" + "<UserDBId>" + sessionID + "</UserDBId>\n"
//				+ "<GroupIndex>0</GroupIndex>\n" + "<ParentFolderIndex>" + searchFolderId + "</ParentFolderIndex>\n"
//				+ "<DocumentName>" + docName + "</DocumentName>\n" + "<CreatedByAppName>" + docExt
//				+ "</CreatedByAppName>\n" + "<Comment>" + strcomments + "</Comment>\n" + "<VolumeIndex>" + volID
//				+ "</VolumeIndex>\n" + "<FilePath>" + filepath + "</FilePath>\n" + "<ProcessDefId>" + processDefId
//				+ "</ProcessDefId>\n<DataDefinition></DataDefinition>\n" + "<ISIndex>" + docIndex + "</ISIndex>\n"
//				+ "<NoOfPages>" + pageCount + "</NoOfPages>\n"
//				+ "<AccessType>I</AccessType>\n<VersionFlag>Y</VersionFlag>\n" + "<DocumentType>N</DocumentType>\n"
//				+ "<DocumentSize>" + docSize + "</DocumentSize>\n" + "</NGOAddDocument_Input>";
//	}
//
//	public static String opFileXML(String cabinetName, String sessionID, String processDefID,
//			String strParentFolderIndex, String createdByApp, String comment, String filepath, String isindex2,
//			int noofpages, long strDocumentSize, String doctype1, String documentName) {
//		return "<?xml version=\"1.0\"?><NGOAddDocument_Input><Option>NGOAddDocument</Option>" + "<CabinetName>"
//				+ cabinetName + "</CabinetName>" + "<UserDBId>" + sessionID + "</UserDBId>"
//				+ "<GroupIndex>0</GroupIndex>" + "<ParentFolderIndex>" + strParentFolderIndex + "</ParentFolderIndex>"
//				+ "<DocumentName>" + documentName + "</DocumentName>" + "<CreatedByAppName>" + createdByApp
//				+ "</CreatedByAppName>" + "<Comment>" + comment + "</Comment>" + "<VolumeIndex>1</VolumeIndex>"
//				+ "<FilePath>" + filepath + "</FilePath>" + "<ProcessDefId>" + processDefID + "</ProcessDefId>"
//				+ "</DataDefinition_>" + "<ISIndex>" + isindex2 + "</ISIndex>" + "<NoOfPages>" + noofpages
//				+ "</NoOfPages>" + "<DocumentType>" + doctype1 + "</DocumentType>" + "<DocumentSize>" + strDocumentSize
//				+ "</DocumentSize>" + "</NGOAddDocument_Input>";
//	}
//
//	public static String wfsSelectWithColumnNames(String sCabinet, String sSessionID, String tableName,
//			String[] colName, String[] conditionCol, String[] conditionVal, String[] columnType, String operator) {
//
//		String sInputXML = "<?xml version=\"1.0\"?>" + "<WFReusableComponent_Input>"
//				+ "<Option>WFSSelectWithColumnNames</Option>" + "<EngineName>" + sCabinet + "</EngineName>"
//				+ "<SessionID>" + sSessionID + "</SessionID>" + "<Query></Query>" + "<TableName>" + tableName
//				+ "</TableName>" + "<Columns>";
//
//		for (String str : colName)
//			sInputXML += "<Column><ColumnName>" + str + "</ColumnName></Column>";
//
//		sInputXML += "</Columns>" + "<RecordCriteria>" + "<Columns>";
//		for (int i = 0; i < conditionCol.length; i++) {
//
//			if (i >= 1) {
//				sInputXML += "<Column>" + "<Operator>" + operator + "</Operator>" + "<ColumnName>" + conditionCol[i]
//						+ "</ColumnName>" + "<ColumnValue>" + conditionVal[i] + "</ColumnValue>" + "<ColumnType>"
//						+ columnType[i] + "</ColumnType>" + "<LogicalOperator>=</LogicalOperator>" + "</Column>";
//			} else {
//				sInputXML += "<Column>" + "<ColumnName>" + conditionCol[i] + "</ColumnName>" + "<ColumnValue>"
//						+ conditionVal[i] + "</ColumnValue>" + "<ColumnType>" + columnType[i] + "</ColumnType>"
//						+ "<LogicalOperator>=</LogicalOperator>" + "</Column>";
//			}
//
//		}
//		sInputXML += "</Columns>" + "</RecordCriteria>" + "<BatchInfo>" + "<BatchSize>100</BatchSize>" + "</BatchInfo>"
//				+ "<LastValue>4</LastValue>" + "<LastValueType>3</LastValueType>" + "</WFReusableComponent_Input>";
//		return sInputXML;
//	}
//
//	public static String wfsProcedure(String strEngineName, String sessionId, String strProcName, String[] paramVal) {
//
//		String sInputXML = "<?xml version=\"1.0\"?>" + "<WFReusableComponent_Input>" + "<Option>WFSProcedure</Option>"
//				+ "<EngineName>" + strEngineName + "</EngineName>" + "<SessionID>" + sessionId + "</SessionID>"
//				+ "<ProcedureName>" + strProcName + "</ProcedureName>" + "<Parameters>";
//
//		for (int i = 0; i < paramVal.length; i++) {
//			callBackLogger.writeConsole("paramVal[i]:: at index: " + i + " : " + paramVal[i]);
//			sInputXML += "<Parameter><ParameterValue>" + paramVal[i]
//					+ "</ParameterValue><ParameterType>10</ParameterType><ParameterIndex>" + (i + 1)
//					+ "</ParameterIndex></Parameter>";
//
//		}
//
//		sInputXML += "</Parameters>" + "</WFReusableComponent_Input>";
//		return sInputXML;
//
//	}
//
//	public static String wfsUpdate(String strEngineName, String sessionId, String strProcName, String[] colName,
//			String[] colVal, String[] colType, String[] conditionCol, String[] conditionVal, String operator) {
//		String sInputXML = "<?xml version=\"1.0\"?>" + "<WFReusableComponent_Input>" + "<Option>WFSUpdate</Option>"
//				+ "<EngineName>" + strEngineName + "</EngineName>" + "<SessionID>" + sessionId + "</SessionID>"
//				+ "<TableName>" + strProcName + "</TableName>" + "<RecordData>" + "<columns>";
//
//		callBackLogger.writeConsole(sInputXML);
//		for (int i = 0; i < colName.length; i++) {
//			sInputXML += "<Column><ColumnName>" + colName[i] + "</ColumnName>" + "<ColumnValue>" + colVal[i]
//					+ "</ColumnValue>" + "<ColumnType>" + colType[i] + "</ColumnType>" + "</Column>";
//		}
//		callBackLogger.writeConsole(sInputXML);
//		sInputXML += "</Columns>" + "<RecordCriteria>" + "<Columns>";
//		for (int j = 0; j < conditionCol.length; j++) {
//
//			if (j >= 1) {
//				sInputXML += "</RecordData>" + "<RecordCriteria>" + "<Column>" + "<Operator>" + operator + "</Operator>"
//						+ "<ColumnName>" + conditionCol[j] + "</ColumnName>" + "<ColumnValue>" + conditionVal[j]
//						+ "</ColumnValue>" + "<ColumnType>" + colType[j] + "</ColumnType>" + "<RecordCriteria>"
//						+ "</Column>";
//			} else {
//				sInputXML += "<Column>" + "<ColumnName>" + conditionCol[j] + "</ColumnName>" + "<ColumnValue>"
//						+ conditionVal[j] + "</ColumnValue>" + "<ColumnType>" + colType[j] + "</ColumnType>"
//
//						+ "</Column>";
//			}
//
//		}
//		if (!sInputXML.contains("</RecordData>")) {
//			sInputXML += "</RecordData>";
//		}
//
//		sInputXML += "</Columns>" + "</RecordCriteria>" + "<BatchInfo>" + "<BatchSize>100</BatchSize>" + "</BatchInfo>"
//				+ "<LastValue>4</LastValue>" + "<LastValueType>3</LastValueType>" + "</WFReusableComponent_Input>";
//
//		return sInputXML;
//	}
//
//	public static String wfsInsert(String strEngineName, String sessionId, String strProcName, String[] colName,
//			String[] colVal, String[] colType) {
//
//		String sInputXML = "<?xml version=\"1.0\"?>" + "<WFReusableComponent_Input>" + "<Option>WFSInsert</Option>"
//				+ "<EngineName>" + strEngineName + "</EngineName>" + "<SessionID>" + sessionId + "</SessionID>"
//				+ "<TableName>" + strProcName + "</TableName>" + "<columns>";
//
//		for (int i = 0; i < colName.length; i++) {
//			if (colVal[i] != null && !colVal[i].isEmpty()) {
//				sInputXML += "<Column><ColumnName>" + colName[i] + "</ColumnName><ColumnValue>" + colVal[i]
//						+ "</ColumnValue><ColumnType>" + colType[i] + "</ColumnType></Column>";
//			}
//		}
//		sInputXML += "</Columns>" + "</WFReusableComponent_Input>";
//
//		return sInputXML;
//	}
//
//	public static String commonDBmethod(String strEngineName, String sessionId, String tableName, String query) {
//
//		return "<WFReusableComponent_Input> <Option>WFSSelectWithColumnNames</Option> <EngineName>" + strEngineName
//				+ "</EngineName> <SessionID>" + sessionId + "</SessionID> <Query>" + query + "</Query> <TableName>"
//				+ tableName + "</TableName> </WFReusableComponent_Input>";
//	}
}