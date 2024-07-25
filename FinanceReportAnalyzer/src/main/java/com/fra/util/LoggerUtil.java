package com.fra.util;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;



public class LoggerUtil {
    public static final Logger logger = Logger.getLogger(LoggerUtil.class);


    public static void configureLogger() {
        PropertyConfigurator.configure("src/main/resources/log4j.properties");
    }


    public static Logger getLogger() {
        return logger;
    }
}