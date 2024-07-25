package com.fra.model;



import org.joda.time.DateTime;



public class Report {
    private DateTime date;
    private String name;
    private double price;
    private double change;
    private double changePercent;


    public Report(
        DateTime date,
        String name,
        double price,
        double change,
        double changePercent
    ) {
        this.date = date;
        this.name = name;
        this.price = price;
        this.change = change;
        this.changePercent = changePercent;
    }
}