package com.first.fromNone.parser;

import org.slf4j.Logger;

import com.first.fromNone.commons.CallBackLogger;

public class XMLParser {
	private String parseString;
	private String copyString;
	private int indexOfPrevSrch;

	CallBackLogger callBackLogger = new CallBackLogger();

	public XMLParser() {
	}

	public XMLParser(String parseThisString) {
		this.copyString = parseThisString;
		this.parseString = toUpperCase(this.copyString, 0, 0);
	}

	public void setInputXML(String parseThisString) {
		if (parseThisString != null) {
			this.copyString = (parseThisString);
			this.parseString = toUpperCase(this.copyString, 0, 0);
			this.indexOfPrevSrch = 0;
		} else {
			this.parseString = null;
			this.copyString = null;
			this.indexOfPrevSrch = 0;
		}
	}

	public String getValueOf(String valueOf) {
		try {
			return this.copyString.substring(
					this.parseString.indexOf("<" + toUpperCase(valueOf, 0, 0) + ">") + valueOf.length() + 2,
					this.parseString.indexOf("</" + toUpperCase(valueOf, 0, 0) + ">"));
		} catch (StringIndexOutOfBoundsException stringindexoutofboundsexception) {
			callBackLogger.logConsole(String.valueOf(stringindexoutofboundsexception));
		}

		return "";
	}

	public String getFirstValueOf(String valueOf) {
		try {
			this.indexOfPrevSrch = this.parseString.indexOf("<" + toUpperCase(valueOf, 0, 0) + ">");

			return (this.copyString.substring(this.indexOfPrevSrch + valueOf.length() + 2,
					this.parseString.indexOf("</" + toUpperCase(valueOf, 0, 0) + ">")));
		} catch (StringIndexOutOfBoundsException stringindexoutofboundsexception) {
			callBackLogger.logConsole(String.valueOf(stringindexoutofboundsexception));
		}

		return "";
	}

	public String getNextValueOf(String valueOf) {
		try {
			this.indexOfPrevSrch = this.parseString.indexOf("<" + toUpperCase(valueOf, 0, 0) + ">",
					this.indexOfPrevSrch + valueOf.length() + 2);

			return (this.copyString.substring(this.indexOfPrevSrch + valueOf.length() + 2,
					this.parseString.indexOf("</" + toUpperCase(valueOf, 0, 0) + ">", this.indexOfPrevSrch)));
		} catch (StringIndexOutOfBoundsException stringindexoutofboundsexception) {
			callBackLogger.logConsole(String.valueOf(stringindexoutofboundsexception));
		}

		return "";
	}

	public String toUpperCase(String valueOf, int begin, int end) throws StringIndexOutOfBoundsException {
		String returnStr = "";
		try {
			int count = valueOf.length();
			char[] strChar = new char[count];
			valueOf.getChars(0, count, strChar, 0);
			while (count-- > 0) {
				strChar[count] = Character.toUpperCase(strChar[count]);
			}
			returnStr = new String(strChar);
		} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
			callBackLogger.logConsole(String.valueOf(arrayindexoutofboundsexception));
		}
		return returnStr;
	}

	public String toString() {
		return this.copyString;
	}
}