package com.fra.service;



import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.Days;

import com.fra.model.Report;
import com.fra.util.LoggerUtil;



public class DateService {
    public void logDateDifferences(List<Report> reports) {
        DateTime now = DateTime.now();

        for(Report report : reports) {
            int daysBetween = Days.daysBetween(report.getDate(), now).getDays();
            LoggerUtil.getLogger().info("Days since report " + report.getName() + ":" + daysBetween);
        }
    } 
}