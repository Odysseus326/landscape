package com.emarts.Landscape.Model;

// !!!!! This class/table should not be foreign, it should be imported/copied
public class Transactions {

    private short Id;  //!!!!! ID SHOULD BE UNIQUE ACROSS ALL TENANTS, NOT JUST THE ASSIGNED ONE
    private FeeChart transaction;
}

// !!!!! CREATE A PLAN FOR STORING PAST TRANSACTIONS !!!!!