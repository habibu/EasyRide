package model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ChargesMade
    {
    private final Set<RentalType> rentalTypes;
    private final Map<Cliente, String[]> carRents;
    private int duration;
    private float toalAmount;

    public ChargesMade(int duration, Set<RentalType> rentalTypes, Map<Cliente, String[]> carRents, float toalAmount) {
        this.duration = duration;
        this.rentalTypes = rentalTypes;
        this.carRents = carRents;
        this.toalAmount = toalAmount;
    }

    public ChargesMade(int duration, Set<RentalType> rentalTypes, Map<Cliente, String[]> carRents, float toalAmount) {
        this.duration = duration;
        this.rentalTypes = new HashSet<RentalType>();
        this.carRents = new HashMap<Cliente, String>();
        this.toalAmount = toalAmount;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Set<RentalType> getRentalTypes() {
        return rentalTypes;
    }

    public Map<Cliente, String[]> getCarRents() {
        return carRents;
    }

    public float getToalAmount() {
        return toalAmount;
    }

    public void setToalAmount(float toalAmount) {
        this.toalAmount = toalAmount;
    }
    }
