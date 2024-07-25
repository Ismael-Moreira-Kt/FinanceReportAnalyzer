package com.fra;



import java.io.IOException;
import java.util.List;

import com.fra.model.Report;
import com.fra.service.DataExtractorService;
import com.fra.util.LoggerUtil;



public class App {
    public static void main(String[] args) {
        LoggerUtil.configureLogger();
        LoggerUtil.getLogger().info("Starting the Report Analyzer Application...");
    
        String url = "https://finance.yahoo.com/";
        String reportFilePath = "report.xlsx";
    
        DataExtractorService extractorService = new DataExtractorService();
    
        try {
            List<Report> reports = extractorService.extracReports(url);
        } catch(IOException exception) {
            LoggerUtil.getLogger().error("Error processing reports", exception);
        }
    }
}