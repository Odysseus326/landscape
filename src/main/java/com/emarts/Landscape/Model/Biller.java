package com.emarts.Landscape.Model;

public class Biller {

    private short Id;
    private String name;
    private String service;
    private String phone;
    private String email;
    private String fax;
    private String website;
    private String address;

    // Constructors /////////////////////////////////////////////////////////////////////////

    public Biller() {}

    public Biller(short id, String name, String service, String phone, String email, String website, String fax, String address) {
        Id = id;
        this.name = name;
        this.service = service;
        this.phone = phone;
        this.email = email;
        this.website = website;
        this.fax = fax;
        this.address = address;
    }

    // Getters /////////////////////////////////////////////////////////////////////////

    public short getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String service() {
        return service;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getFax() {
        return fax;
    }

    public String getWebsite() {
        return website;
    }

    public String getAddress() {
        return address;
    }

    // Setters /////////////////////////////////////////////////////////////////////////

    public void setId(short id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setService(String service) {
        this.service = service;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
