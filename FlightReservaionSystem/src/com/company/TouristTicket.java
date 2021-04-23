package com.company;

public class TouristTicket {

    String pnr;
    String from;
    String to;
    String departureDateTime;
    String arrivalDateTime;

    public TouristTicket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seat_no, float price, boolean cancelled, String hotelAddress, String[] touristLocation) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seat_no = seat_no;
        this.price = price;
        this.cancelled = cancelled;
        this.hotelAddress = hotelAddress;
        this.touristLocation = touristLocation;
    }

    String seat_no;
    float price;
    boolean cancelled;
    public String hotelAddress;
    String[] touristLocation = new String[5];

    public String checkStatus() {
        if (cancelled) {
            return "cancelled";

        } else {
            return "confirmed";

        }
    }

    public double getFlightDuration() {
        return Math.random() * 10;

    }

    public void cancel(boolean cancelled) {
        this.cancelled=cancelled;


    }

    public String getHotelAddress() {
        return this.hotelAddress;
    }

    public String[] getTouristLocations() {
        return this.touristLocation;
    }

    public void addTouristLocation(String[] location) {
        this.touristLocation=location;
    }

    public void removeTouristLocation(String[] location) {
        this.touristLocation=location;
        location=null;

    }
}

