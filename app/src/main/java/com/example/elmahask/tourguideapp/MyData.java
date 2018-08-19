package com.example.elmahask.tourguideapp;

public class MyData {
    private String title;
    private String description;
    private String address;
    private String phone;
    private int imageResourcesId;

    public MyData(String title, String description, String address, String phone, int imageResourcesId) {
        this.title = title;
        this.description = description;
        this.address = address;
        this.phone = phone;
        this.imageResourcesId = imageResourcesId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public int getImageResourcesId() {
        return imageResourcesId;
    }
}
