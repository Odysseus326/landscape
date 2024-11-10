package com.emarts.Landscape.Model;

public class Fee {

    private String name;  //Id
    private double amount;
    private Biller biller;

    // Constructors /////////////////////////////////////////////////////////////////////////

    public Fee() {}

    public Fee(String name, double amount, Biller biller) {
        this.name = name;
        this.amount = amount;
        this.biller = biller;
    }

    // Getters /////////////////////////////////////////////////////////////////////////

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public Biller getBiller() {
        return biller;
    }

    // Setters /////////////////////////////////////////////////////////////////////////

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setBiller(Biller biller) {
        this.biller = biller;
    }
}

