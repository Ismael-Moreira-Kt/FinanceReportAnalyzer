package com.fra.service;



import java.util.List;

import com.fra.model.Report;
import com.google.common.collect.Lists;



public class DataProcessorService {
    public List<Report> filterReports(List<Report> reports) {
        List<Report> filteredReports = Lists.newArrayList();
        filteredReports.addAll(reports);
        
        return filteredReports;
    }
}