package com.first.fromNone.commons;


import java.io.FileInputStream;
import java.util.Properties;

public class Constants {

	public static String sIPUtility;
	public static String sPORT;
	public static String strServerType = "";
	public static String strCabinetName = "";

	public static String strUserName = "";
	public static String strPassword = "";
	public static String strSessionId;
	public static String strUserId;

	public static String connectTimeout = "";
	public static String readTimeout = "";
	public static String url = "";
	public static String port = "";
	public static String VolId="";

	public static final String USERNAME = "system";
	static {
		try {
			Properties ini = new Properties();
			ini.load(new FileInputStream(System.getProperty("user.dir") + System.getProperty("file.separator")
					+ "msmeAPI" + System.getProperty("file.separator") + "config" + System.getProperty("file.separator")
					+ "callBack" + System.getProperty("file.separator") + "server.properties"));

			//ini.load(new FileInputStream("C:\\Users\\dharmendra.sharma\\Desktop\\dharmendra_ttp\\bob\\server.properties"));

			Constants.strCabinetName = ini.getProperty("CabinetName");
			Constants.sIPUtility = ini.getProperty("IPUtility");
			Constants.sPORT = ini.getProperty("PORT");
			Constants.strServerType = ini.getProperty("ServerType");
			Constants.strUserName = ini.getProperty("Username");
			Constants.strPassword = ini.getProperty("Password");
			Constants.connectTimeout = ini.getProperty("connectTimeout");
			Constants.readTimeout = ini.getProperty("readTimeout");
			Constants.url = ini.getProperty("url");
			Constants.port = ini.getProperty("port");
			Constants.VolId = ini.getProperty("VolId");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
