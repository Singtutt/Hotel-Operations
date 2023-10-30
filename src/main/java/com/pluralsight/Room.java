package com.pluralsight;

public class Room {
    private int bedCount;
    private double charge;
    private boolean occupancy;
    private boolean sanitize;

    public Room(int bedCount, double charge) {
        this.bedCount = bedCount;
        this.charge = charge;
        this.occupancy = false;
        this.sanitize = false;
    }

    public int getBedCount() {
        return bedCount;
    }

    public double getCharge() {
        return charge;
    }

    public boolean isOccupancy() {
        return occupancy;
    }

    public boolean isSanitize() {
        return sanitize;
    }
    public boolean isVacancy() {
        return !occupancy && !sanitize;
    }
}
//    public static void main(String[] args) { // Tester
//
//    }