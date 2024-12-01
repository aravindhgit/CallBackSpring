package com.first.fromNone.parser;


import java.io.IOException;
//
//import org.apache.log4j.Logger;
//
//import com.newgen.GlobalVar;
//import com.newgen.commons.Constants;
//import com.newgen.commons.callBackLogger;
//import com.newgen.omni.wf.util.app.NGEjbClient;
//import com.newgen.omni.wf.util.excp.NGException;
//import com.newgen.wfdesktop.xmlapi.WFCallBroker;
//
public class FunctionWI {
//
//	XMLParser xmlParser = new XMLParser();
//	public static NGEjbClient ngEjbClient;
//	private static Logger loggern = Logger.getLogger("consoleLogger");
//
//	/**
//	 * purpose of this method is to connect with server and return the value is
//	 * connection is made or not
//	 * 
//	 * @return flag value true /false
//	 */
//	public boolean connectToServer() {
//		try {
//			//FunctionWI.ngEjbClient = NGEjbClient.getSharedInstance();
//			//FunctionWI.ngEjbClient.initialize(Constants.sIPUtility, Constants.sPORT, Constants.strServerType);
//			FunctionWI.ngEjbClient = NGEjbClient.getSharedInstance();
//			FunctionWI.ngEjbClient.initialize(Constants.sIPUtility, Constants.sPORT, Constants.strServerType);
//			callBackLogger.writeConsole("ngEjbClient.initialize successfully with ServerIP " + Constants.sIPUtility
//					+ " :: Port " + Constants.sPORT + " :: ServerType " + Constants.strServerType);
//
//			return true;
//		} catch (Exception ngE) {
//			callBackLogger.writeConsole("Exception in connectToServer:: " + ngE.getMessage());
//		}
//		return false;
//	}
//
//	public String connectToWorkFlow() {
//		int i = -9;
//		String desc = null;
//		String xmlInput = null;
//		String xmlOutput = null;
//		try {
//			xmlInput = XMLGen.getODConnectInput(Constants.strCabinetName, Constants.strUserName, Constants.strPassword);
//
//			callBackLogger.writeConsole("connectToWorkFlow xmlInput: " + xmlInput);
//
//			xmlOutput = executeWithoutInLog(xmlInput);
//
//			this.xmlParser.setInputXML(xmlOutput);
//			callBackLogger.writeConsole("connectToWorkFlow xmlOutput: " + xmlOutput);
//
//			String s9 = this.xmlParser.getValueOf("Option");
//			callBackLogger.writeConsole("this.xmlParser.getValueOf(\"Option\")-s9 " + s9);
//
//			if (!s9.equalsIgnoreCase("NGOConnectCabinet")) {
//				return "-9~Invalid Workflow Server IP and Port are registered.";
//			}
//
//			String s6 = this.xmlParser.getValueOf("Status");
//			callBackLogger.writeConsole("this.xmlParser.getValueOf(\"Status\")- s6 " + s6);
//			i = Integer.parseInt(s6);
//			if (i == 0) {
//				Constants.strSessionId = this.xmlParser.getValueOf("UserDBId");
//				Constants.strUserId = this.xmlParser.getValueOf("LoginUserIndex");
//				callBackLogger.writeConsole("Constants.strSessionId:: " + Constants.strSessionId
//						+ " Constants.strUserId:: " + Constants.strUserId);
//			} else {
//				String s7 = this.xmlParser.getValueOf("SubErrorCode");
//				desc = this.xmlParser.getValueOf("Description");
//				i = Integer.parseInt(s7);
//			}
//		} catch (Exception e) {
//			desc = "Application Server Down";
//			callBackLogger.writeConsole("exception in connectToWorkFlow:: " + e.getMessage());
//			e.printStackTrace();
//		}
//
//		return i + "~" + desc;
//	}
//
//	public String executeWithoutInLog(String inXml) throws NumberFormatException, IOException, Exception {
//		try {
//			loggern.debug(" inXml of executeWithoutInLog" + inXml);
//			//String outXml = ngEjbClient.makeCall(inXml);
//			String outXml = WFCallBroker.execute(inXml, Constants.sIPUtility, Integer.valueOf(Constants.sPORT), 1);
//			loggern.debug(" outXml of executeWithoutInLog " + outXml);
//
//			return outXml;
//		} catch (NGException ngE) {
//
//			disconnectFromServer();
//			System.out.println("disconnectFromServer: " + ngE.getMessage());
//			if (connectToServer())
//				try {
//					return FunctionWI.ngEjbClient.makeCall(inXml);
//				} catch (NGException ngE1) {
//					loggern.error(ngE1);
//				}
//		}
//		return "";
//	}
//
//	public void disconnectFromServer() {
//		loggern.info("disconnectFromServer ");
//	}

}
