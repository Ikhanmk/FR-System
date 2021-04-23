package com.company;

public class Ticket {
    private String pnr, from, to, departureDateTime, arraivalDateTime, seatNo;
    private Flight flight;
    private Passenger passenger;
    private float price;
    private boolean cancelled;

    public Ticket(String pnr, String from, String to, String departureDateTime,
                  String arraivalDateTime, String seatNo, Flight flight,
                  Passenger passenger, float price, boolean cancelled) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureDateTime = departureDateTime;
        this.arraivalDateTime = arraivalDateTime;
        this.seatNo = seatNo;
        this.flight = flight;
        this.passenger = passenger;
        this.price = price;
        this.cancelled = cancelled;
    }

    //public Passenger getPassenger() {
    // return passenger;
    // }

//    public String checkStatus(){
//
//    }
//
//    public int getFlightDuration(){
//
//    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArraivalDateTime() {
        return arraivalDateTime;
    }

    public void setArraivalDateTime(String arraivalDateTime) {
        this.arraivalDateTime = arraivalDateTime;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }


    public void cancel(boolean cancelled) {
        this.cancelled = cancelled;
    }
}