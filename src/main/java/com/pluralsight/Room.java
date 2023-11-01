package com.pluralsight;

public class Room {
    private int bedCount;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int bedCount, double price) {
        this.bedCount = bedCount;
        this.price = price;
        this.occupied = false;
        this.dirty = false;
    }

    public int getBedCount() {
        return bedCount;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }
    public boolean isAvailable() {
        return !occupied && !dirty;
    }

    public void roomClean() {
        dirty = false;
    }
    public void checkIn() {
        occupied = true;
        dirty = true;
    }
    public void checkOut() {
        occupied = false;
    }
}
//    public static void main(String[] args) { // Tester
//
//    }