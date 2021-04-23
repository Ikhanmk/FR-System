package com.company;

public class RegularTicket{
    private  String specialServices;
    public RegularTicket(String specialServices,String pnr, String from, String to, String departureDateTime, String arraivalDateTime, String seatNo, Flight flight, Passenger passenger, float price, boolean cancelled) {
        this.specialServices=specialServices;
    }



    public String getSpecialServices() {
        return this.specialServices;

    }

    public void updateSpecialServices(String specialServices) {
        this.specialServices=specialServices;

    }
}

