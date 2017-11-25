package model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ChargesMade
    {

    private int duration;
    private float totalAmount;
    private final Set<RentalType> rentalTypes;
    private final Map<Cliente, String[]> carRents;

    public ChargesMade(int duration, float totalAmount, Set<RentalType> rentalTypes, Map<Cliente, String[]> carRents) {
        this.duration = duration;
        this.totalAmount = totalAmount;
        this.rentalTypes = rentalTypes;
        this.carRents = carRents;
    }

    public ChargesMade(int duration, Set<RentalType> rentalTypes, Map<Cliente, String[]> carRents, float totalAmount) {
        this.duration = duration;
        this.rentalTypes = new HashSet<RentalType>();
        this.carRents = new HashMap<Cliente, String[]>();
        this.totalAmount = totalAmount;
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

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * Function to calculate total amount to be paid after rental perios
     */
    public void carHired(Cliente cliente, CarModel carModel, RentalType rentalType, Float totalAmount, String carRent) {
        Float amount = this.getTotalAmount();
        String[] clientRent = this.carRents.get(cliente);
        String[] carRentedByCliente = new String[clientRent.length + 1];

        /** Verify whether the cliente hired a car*/
        if (!this.carRents.containsKey(cliente)) {
            this.carRents.put(cliente, new String[]{carRent});
            return;
        }
        /** Calculate a total amount with respect to the car hiredby client*/

    }
    }


