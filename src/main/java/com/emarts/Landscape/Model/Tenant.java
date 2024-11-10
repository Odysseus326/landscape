package com.emarts.Landscape.Model;

public class Tenant {
    private int id;  // !!!!! MUST MAKE INCREMENTAL, AUTOMATIC, AND UNIQUE. ADD CHECK FOR DUPLICATES AT CREATION !!!!!
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private Location location;
    private String dateOfMoveIn;
    // private [type] paperwork    Study on how to best implement
    private Vehicle vehicle;
    private FeeChart feeChart;
    private Transactions transactionHistory;


    // Constructors  /////////////////////////////////////////////////////////////////////////

    public Tenant() {}

    public Tenant(int id, String firstName, String lastName, String dateOfBirth, Location location, String dateOfMoveIn, Vehicle vehicle, FeeChart feeChart) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.location = location;

        this.dateOfMoveIn = dateOfMoveIn;
        this.vehicle = vehicle;
        this.feeChart = feeChart;

    }

    // Getters /////////////////////////////////////////////////////////////////////////

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public Location getLocation() {
        return location;
    }

    public String getDateOfMoveIn() {
        return dateOfMoveIn;
    }


    public Vehicle getVehicle() {
        return vehicle;
    }

    public FeeChart getFeeChart() {
        return feeChart;
    }

    // Setters /////////////////////////////////////////////////////////////////////////

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setDateOfMoveIn(String dateOfMoveIn) {
        this.dateOfMoveIn = dateOfMoveIn;
    }


    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setFeeChart(FeeChart feeChart) {
        this.feeChart = feeChart;
    }
}


