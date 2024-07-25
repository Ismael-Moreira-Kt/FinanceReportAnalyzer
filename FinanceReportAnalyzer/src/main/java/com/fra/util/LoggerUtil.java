package com.fra.util;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;



public class LoggerUtil {
    public static final Logger logger = Logger.getLogger(LoggerUtil.class);


    public static void configureLogger() {
        try {
            PropertyConfigurator.configure(LoggerUtil.class.getClassLoader().getResource("log4j.properties"));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }


    public static Logger getLogger() {
        return logger;
    }
}