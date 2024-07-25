package com.fra.service;



import com.fra.model.Report;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;



public class ReportGenerationService {
    public void generateExcelReport(List<Report> reports, String filePath) throws IOException {
        Workbook workbook;
        Sheet sheet;
        
        boolean fileExists = new File(filePath).exists();
        boolean headerExists = false;

        if (fileExists) {
            try (FileInputStream fileIn = new FileInputStream(filePath)) {
                workbook = new XSSFWorkbook(fileIn);
                sheet = workbook.getSheetAt(0);

                Row headerRow = sheet.getRow(0);
        
                if (headerRow != null && !isRowEmpty(headerRow)) {
                    headerExists = true;
                }
            }
        } else {
            workbook = new XSSFWorkbook();
            sheet = workbook.createSheet("Report");
        }
    }
}