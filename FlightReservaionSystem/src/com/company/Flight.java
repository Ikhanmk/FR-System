package com.company;

public class Flight {
    private String flightNumber;
    private String airline;
    private int capacity;
    private int bookedSeats;
    private int bookingCounter=0;

    //Constructor

    public Flight(String flightNumber, String airline, int capacity, int bookedSeats) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }

    //COPY CONSTRUCTOR
    public Flight(Flight flight) {
        this.flightNumber = flight.flightNumber;
        this.airline = flight.airline;
        this.capacity = flight.capacity;
        this.bookedSeats = flight.bookedSeats;
    }
    //GETTERS AND SETTERS
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public int getBookingCounter() {
        return bookingCounter;
    }

    public void setBookingCounter(int bookingCounter) {
        this.bookingCounter = bookingCounter;
    }

    //METHODS
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
