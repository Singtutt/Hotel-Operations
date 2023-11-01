package com.pluralsight;

public class Reservation {
    private String roomType;
    private double pricePerNight;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        if (roomType.equals("king")) { // Suite Style 1
            this.pricePerNight = 139.00;
        } else if (roomType.equals("double")) { // Suite Style 2
            this.pricePerNight = 124.00;
        }
    }

    public String getRoomType() { // E1
        return roomType;
    }

    public void setRoomType(String roomType) { // E1
        this.roomType = roomType;
    }

    public double getReservationTotal() { // E1
        double total = pricePerNight * numberOfNights;
        if (isWeekend) {
            total *= 1.10; // 10% "weekend" up-charge
        }
        return total;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        this.isWeekend = weekend;
    }

    public double getTotalCost() {
        double priceTotal = getReservationTotal();
        if (isWeekend) {
            priceTotal *= 1.10;
        }
        return priceTotal;
    }
}
