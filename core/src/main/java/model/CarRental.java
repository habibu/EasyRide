package model;
/*
Car Rental services class
Added by Habibu Abdullahi @n 2017.11.02
*/

public class CarRental
    {
    private final String companyName;
    private final String address;
    private int registrationNumber;
    private int companyID;
    private boolean carStatus;
    private RentalType rentalType;
    private CarModel carModel;

    public CarRental(String companyName, String address, int registrationNumber, int companyID, boolean carStatus, RentalType rentalType, CarModel carModel) {
        this.companyName = companyName;
        this.address = address;
        this.registrationNumber = registrationNumber;
        this.companyID = companyID;
        this.carStatus = carStatus;
        this.rentalType = rentalType;
        this.carModel = carModel;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getAddress() {
        return address;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public boolean isCarStatus() {
        return carStatus;
    }

    public void setCarStatus(boolean carStatus) {
        this.carStatus = carStatus;
    }

    public RentalType getRentalType() {
        return rentalType;
    }

    public void setRentalType(RentalType rentalType) {
        this.rentalType = rentalType;
    }
    }
