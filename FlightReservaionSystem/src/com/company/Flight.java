package com.company;

public class Flight {
    public String flightNumber;
    public String airline;
    public int capacity;
    private int bookedSeats;
    public int bookingCounter=0;

    public Flight(String flightNumber, String airline, int capacity, int bookedSeats, int bookingCounter) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
        this.bookingCounter = bookingCounter;
    }

    public String getFlightDetails()
    {
        return "flightNumber is: "+flightNumber+", airline is: "+airline+", capacity is: "+capacity+", bookedSeats: "+bookedSeats;

    }
    public boolean checkAvailability()
    {
        return bookedSeats < capacity;
    }
    public void incrementBookingCounter()
    {
     bookingCounter++;
    }
}
