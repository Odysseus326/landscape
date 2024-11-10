package com.emarts.Landscape.Model;

import java.util.List;

public class FeeChart {

    private String id;
    private List<Fee> feeChart;

    // Constructors /////////////////////////////////////////////////////////////////////////

    public FeeChart() {}

    // Manually Creates ID w/o billing chart
    public FeeChart(String id) {
        this.id = id;
        this.feeChart = null;
    }

    // Manually Creates ID w/ billing chart
    public FeeChart(String id, List<Fee> fees) {
        this.id = id;
        this.feeChart = fees;
    }

    // Automatically creates ID, no billing chart
    public FeeChart(String firstName, String lastName, String dateOfBirth) {
        this.id = newId(firstName, lastName, dateOfBirth);
        this.feeChart = null;
    }

    // Automatically create ID, with billing chart
    public FeeChart(String firstName, String lastName, String dateOfBirth, List<Fee> fees) {
        this.id = newId(firstName, lastName, dateOfBirth);
        this.feeChart = fees;
    }

    // Getters /////////////////////////////////////////////////////////////////////////


    public String getId() {
        return id;
    }

    public List<Fee> getFeeChart() {
        return feeChart;
    }

    // Setters /////////////////////////////////////////////////////////////////////////

    public void setId(String id) {  // Manually Sets ID
        this.id = id;
    }

    // Sets ID with firstName, lastName, and Date of Birth
    public void setID(String firstName, String lastName, String dateOfBirth) {
        this.id = newId(firstName, lastName, dateOfBirth);

    }

    public void setFeeChart(List<Fee> feeChart) {
        this.feeChart = feeChart;
    }

    // Creates a new ID using firstName, lastName, and Date of Birth
    private String newId(String firstName, String lastName, String dateOfBirth) {
        String newId = "";
        StringBuilder input = new StringBuilder();
        input.append(firstName.charAt(0)).append(lastName.charAt(0)).append(dateOfBirth);

        // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        // WRITE CODE TO CHECK IF ID ALREADY EXISTS (NEEDED FOR HEXADECIMAL)
        // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        newId = input.toString();
        return newId;
    }
}


