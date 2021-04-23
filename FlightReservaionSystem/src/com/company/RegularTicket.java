package com.company;

import java.lang.Math;
public class RegularTicket<String> {
    String pnr;
    String from;
    String to;
    String departureDateTime;
    String arrivalDateTime;
    String seat_no;
    float price;
    boolean cancelled;
    String specialServices;


    public RegularTicket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seat_no, float price, boolean cancelled, String specialServices) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seat_no = seat_no;
        this.price = price;
        this.cancelled = cancelled;
        this.specialServices = specialServices;
    }


    public java.lang.String checkStatus() {
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

    public String getSpecialServices() {
        return this.specialServices;

    }

    public void updateSpecialServices(String specialServices) {
        this.specialServices=specialServices;

    }
}

