/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author misra
 */
public class Person {

    String FirstName;
    String LastName;
    int Age;

    String Gender;
    String Email;
    String Phone;

    Long SSN;
    String CompanyName;
    double AnnualIncome;

    public Address personAddress;

//    public Person() {
//        this.pAddress = new Address();
//    }
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public Long getSSN() {
        return SSN;
    }

    public void setSSN(java.lang.Long SSN) {
        this.SSN = SSN;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    public double getAnnualIncome() {
        return AnnualIncome;
    }

    public void setAnnualIncome(double AnnualIncome) {
        this.AnnualIncome = AnnualIncome;
    }

    @Override
    public String toString() {
        return FirstName;
    }
}
