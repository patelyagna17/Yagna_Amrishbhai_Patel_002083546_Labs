/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author misra
 */
public class Address extends Person {

    String HomeAddress;
    String City;
    String State;
    String Country;
    String ZipCode;

    String WorkAddress;
    String WorkState;
    String WorkCity;
    String WorkZipCode;

    public String getHomeAddress() {
        return HomeAddress;
    }

    public void setHomeAddress(String HomeAddress) {
        this.HomeAddress = HomeAddress;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String ZipCode) {
        this.ZipCode = ZipCode;
    }

    public String getWorkAdd() {
        return WorkAddress;
    }

    public void setWorkAddress(String WorkAddress) {
        this.WorkAddress = WorkAddress;
    }

    public String getWorkState() {
        return WorkState;
    }

    public void setWorkState(String WorkState) {
        this.WorkState = WorkState;
    }

    public String getWorkCity() {
        return WorkCity;
    }

    public void setWorkCity(String WorkCity) {
        this.WorkCity = WorkCity;
    }

    public String getWorkZipCode() {
        return WorkZipCode;
    }

    public void setWorkZipCode(String WorkZipCode) {
        this.WorkZipCode = WorkZipCode;
    }

}
