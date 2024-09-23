/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author yagnapatel
 */
public class VitalSigns {
    String date;
    double bloodPressure; // numbers with decimals
    double temperature;
    int pulse; // number without decimals 

    public String getdate() {
        return date;
    }

    public void setdate(String date) {
        this.date = date;
    }

    public double getbloodPressure() {
        return bloodPressure;
    }

    public void setbloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double gettemperature() {
        return temperature;
    }

    public void settemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getpulse() {
        return pulse;
    }

    public void setpulse(int pulse) {
        this.pulse = pulse;
    }
 
    @Override
    public String toString (){
        return getdate();
    
}
}