package com.fra;



import com.fra.util.LoggerUtil;



public class App {
    public static void main(String[] args) {
        LoggerUtil.configureLogger();
        LoggerUtil.getLogger().info("Starting the Report Analyzer Application...");
    }
}