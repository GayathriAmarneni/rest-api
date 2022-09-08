package com.example.restproducer.bean;

public class Car {

    private String carName;
    private String carModel;
    private String companyName;

    public Car(String carName, String carModel, String companyName) {
        this.carName = carName;
        this.carModel = carModel;
        this.companyName = companyName;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

}
