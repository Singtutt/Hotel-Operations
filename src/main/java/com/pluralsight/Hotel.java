package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicsRooms;

    public Hotel(String name, int suiteNumber, int roomNumber) {
        this.name = name;
        this.numberOfSuites = suiteNumber;
        this.numberOfRooms = roomNumber;
        this.bookedSuites = 0;
        this.bookedBasicsRooms = 0;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicsRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicsRooms = bookedBasicsRooms;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        if (isSuite) {
            if (numberOfSuites - bookedSuites >= numberOfRooms) {
                bookedSuites += numberOfRooms;
                return true;
            }
        } else {
            if (numberOfRooms - bookedBasicsRooms >= numberOfRooms) {
                bookedBasicsRooms += numberOfRooms;
                return true;
            }
        }
        return false;
    }

    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }

    public int getAvailableRooms() {
        return numberOfRooms - bookedBasicsRooms;
    }
}
