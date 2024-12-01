package com.first.fromNone.commons;

import com.first.fromNone.parser.*;

public class CommonMethods {
//	public static FunctionWI objWF = new FunctionWI();
//	static {
//		if (objWF.connectToServer()) {
//
//			String functionOut = objWF.connectToWorkFlow();
//
//			int i = getErrorCode(functionOut);
//			String desc = "";
//			if (i != 0) {
//				desc = getErrorName(functionOut);
//			}
//
//			if (i == -50167) {
//				String functionOut1 = objWF.connectToWorkFlow();
//				int j = getErrorCode(functionOut1);
//				desc = getErrorName(functionOut);
//				if (j == 0)
//					callBackLogger.writeConsole(" " + j);
//			} else {
//				if ((desc.equals("")) || (desc.equals("null"))) {
//					desc = "Application Server Down";
//				}
//			}
//		}
//	}
//
//	public static int getErrorCode(String str) {
//		String[] temp = str.split("~");
//		if (isInteger(temp[0])) {
//			return Integer.parseInt(temp[0]);
//		}
//		return -9;
//	}
//
//	public static boolean isInteger(String s) {
//		try {
//			if (s.equals("")) {
//				return false;
//			}
//			Integer.parseInt(s);
//			return true;
//		} catch (Exception e) {
//			callBackLogger.printErr(e);
//		}
//		return false;
//	}
//
//	public static String getErrorName(String str) {
//		String[] temp = str.split("~");
//		return temp[1];
//	}
}
