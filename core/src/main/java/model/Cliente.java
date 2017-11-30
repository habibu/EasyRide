package model;

import model.exceptions.UnderAgeClienteException;

import java.util.Date;

import static java.lang.String.*;

public class Cliente
    {
    private final String firstName;
    private final String sureName;
    private final String email;
    private final String address;
    private Date birthDate;
    private RentalType rentalType;
    private Car Car;

    public Cliente(String firstName, String sureName, String email, String address, Date birthDate, RentalType rentalType, Car Car) {
        this.firstName = firstName;
        this.sureName = sureName;
        this.email = email;
        this.address = address;
        this.birthDate = birthDate;
        this.rentalType = rentalType;
        this.Car = Car;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSureName() {
        return sureName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public RentalType getRentalType() {
        return rentalType;
    }

    public void setRentalType(RentalType rentalType) {
        this.rentalType = rentalType;
    }

    public Car getCar() {
        return Car;
    }

    public void setCar(Car Car) {
        this.Car = Car;
    }

    public void setBirthDate() throws UnderAgeClienteException {
        this.birthDate = ClienteAge();
    }

    /**
     * Method to validate client age
     */
    private Date ClienteAge() throws UnderAgeClienteException {

        int currentYear, birthYear, ageResult;


        currentYear = 2017;
        birthYear = 2000;
        Date age = new Date(currentYear - birthYear);
        ageResult = new Integer(valueOf(age));

        if (ageResult <= 17) {

            throw new UnderAgeClienteException("Sorry you are too young to rent a car");
        }
        return age;

    }

    }
