package com.fra.service;



import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import com.fra.model.Report;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class DataExtractorService {
    public static final String CHROME_DRIVER_PATH = "/home/ismael/bin/chromedriver";


    public List<Report> extracReports(String url) {
        System.setProperty("webdirever.chrome.driver", CHROME_DRIVER_PATH)

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
    
        WebDriver driver = new ChromeDriver(options);
        List<Report> reports = new ArrayList<>();

        try {
            driver.get(url);

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        
            try {
                WebElement rejectButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.btn.secondary.reject-all")));
                rejectButton.click();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
}