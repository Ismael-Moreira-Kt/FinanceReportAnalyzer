package com.fra.service;



import com.fra.model.Report;

import java.util.List;

import org.openqa.selenium.chrome.ChromeOptions;



public class DataExtractorService {
    public static final String CHROME_DRIVER_PATH = "/home/ismael/bin/chromedriver";


    public List<Report> extracReports(String url) {
        System.setProperty("webdirever.chrome.driver", CHROME_DRIVER_PATH)

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
    }
}