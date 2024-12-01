package com.first.fromNone.commons;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class CallBackLogger {

    private static final Logger errorLogger = LoggerFactory.getLogger("callBackErrorLogger");
    private static final Logger consoleLogger = LoggerFactory.getLogger("callBackConsoleLogger");
    private static final Logger transactionLogger = LoggerFactory.getLogger("callBackTransactionLogger");
    private static final Logger xmlLogger = LoggerFactory.getLogger("callBackXmlLogger");

    public void logError(String message, Exception e) {
        errorLogger.error(message, e);
    }

    public void logError(String message) {
        errorLogger.error(message);
    }

    public void logConsole(String message) {
        consoleLogger.info(message);
    }

    public void logTransaction(String message) {
        transactionLogger.info(message);
    }

    public void logXml(String message) {
        xmlLogger.info(message);
    }

    public void logDebug(String message) {
        consoleLogger.debug(message);
    }
}
