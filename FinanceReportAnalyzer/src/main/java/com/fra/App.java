package com.fra;



import java.io.IOException;
import java.util.List;

import com.fra.model.Report;
import com.fra.service.DataExtractorService;
import com.fra.service.DataProcessorService;
import com.fra.service.DateService;
import com.fra.service.ReportGenerationService;
import com.fra.util.LoggerUtil;



public class App {
    public static void main(String[] args) {
        LoggerUtil.configureLogger();
        LoggerUtil.getLogger().info("Starting the Report Analyzer Application...");
    
        String url = "https://finance.yahoo.com/";
        String reportFilePath = "report.xlsx";
    
        DataExtractorService extractorService = new DataExtractorService();
        DataProcessorService processorService = new DataProcessorService();
        DateService dateService = new DateService();
        ReportGenerationService generationService = new ReportGenerationService();

        try {
            List<Report> reports = extractorService.extracReports(url);
            LoggerUtil.getLogger().info("Number of reports extracted: " + reports.size());

            dateService.logDateDifferences(reports);

            List<Report> filteredReports = processorService.filterReports(reports);
            LoggerUtil.getLogger().info("Number of filtered reports: " + filteredReports.size()); 

            generationService.generateExcelReport(filteredReports, reportFilePath);
            LoggerUtil.getLogger().info("Report generated successfully.");
        } catch(IOException exception) {
            LoggerUtil.getLogger().error("Error processing reports", exception);
        }
    }
}