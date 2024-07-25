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

        if (!headerExists) {
            createHeaderRow(sheet);
        }

        int rowNum = fileExists ? getLastRowNum(sheet) + 1 : 1;

        for (Report report : reports) {
            Row row = sheet.createRow(rowNum++);
        
            row.createCell(0).setCellValue(report.getDate().toString());
            row.createCell(1).setCellValue(report.getName());
            row.createCell(2).setCellValue(report.getPrice());
            row.createCell(3).setCellValue(report.getChange());
            row.createCell(4).setCellValue(report.getChangePercent());
        }

        try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
            workbook.write(fileOut);
        }

        workbook.close();
    }


    private void createHeaderRow(Sheet sheet) {
        Row row = sheet.createRow(0);
        
        row.createCell(0).setCellValue("Date");
        row.createCell(1).setCellValue("Title");
        row.createCell(2).setCellValue("Price");
        row.createCell(3).setCellValue("Change");
        row.createCell(4).setCellValue("Change Percent");
    }


    private int getLastRowNum(Sheet sheet) {
        int lastRowNum = sheet.getLastRowNum();

        while (lastRowNum > 0 && isRowEmpty(sheet.getRow(lastRowNum))) {
            lastRowNum--;
        }

        return lastRowNum;
    }
    
    
    private boolean isRowEmpty(Row row) {
        if (row == null) return true;

        for (int i = 0; i < row.getLastCellNum(); i++) {
            if (row.getCell(i) != null && !row.getCell(i).toString().trim().isEmpty()) {
                return false;
            }
        }

        return true;
    }
}