package com.pluralsight;

public class Reservation {
    private String suiteStyle;
    private double costPerNight;
    private int stayPeriod;
    private boolean isWeekend;

    public Reservation(String suiteStyle, int stayPeriod, boolean isWeekend) {
        this.suiteStyle = suiteStyle;
        this.stayPeriod = stayPeriod;
        this.isWeekend = isWeekend;
        if (suiteStyle.equals("king")) { // Suite Style 1
            this.costPerNight = 139.00;
        } else if (suiteStyle.equals("double")) { // Suite Style 2
            this.costPerNight = 124.00;
        }
    }

    public String getSuiteStyle() {
        return suiteStyle;
    }
    public void setSuiteStyle(String suiteStyle) {
        this.suiteStyle = suiteStyle;
    }
    public double getPrice() {
        double priceTotal = costPerNight * stayPeriod;
        if (isWeekend) {
            priceTotal *= 1.10; // 10% "weekend" up-charge
        }
        return priceTotal;
    }
    public int getStayPeriod() {
        return stayPeriod;
    }
    public void setStayPeriod(int stayPeriod) {
        this.stayPeriod = stayPeriod;
    }
    public boolean isWeekend() {
        return isWeekend;
    }
    public void setWeekend(boolean weekend) {
        this.isWeekend = weekend;
    }
    public double getTotalCost() {
        return getPrice();
    }
}
