package model;

import model.UnderAgeClienteException.UnderAgeClienteException;

import java.util.Date;

import static java.lang.Integer.valueOf;

public class Cliente {
    private final String firstName;
    private final String surName;
    private final String email;
    private final String address;
    private Date birthDate;
    private RentalType rentalType;
    private CarModel carModel;

    public Cliente(String firstName, String surName, Date birthDate, RentalType rentalType, CarModel carModel) {
        this.firstName = firstName;
        this.surName = surName;
        this.email = email;
        this.address = address;
        this.birthDate = birthDate;
        this.rentalType = rentalType;
        this.carModel = carModel;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getsurName() {
        return surName;
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

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
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
        ageResult = valueOf(String.valueOf(age));

        if (ageResult <= 17) {

            throw new UnderAgeClienteException("Sorry you are too young to rent a car");
        }
        return age;

    }

    /**
     * Funcrion to chech the valid name of the cliente
     */

    @Override
    public String toString() {
        return firstName + " " + surName;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Cliente)) {
            return false;
        }
        return firstName.equals(((Cliente) obj).firstName) && surName.equals(((Cliente) obj).surName);
    }
}
