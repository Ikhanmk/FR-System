package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Flight flight=new Flight("199M","Indigo",360,250);
        System.out.println(flight.getFlightDetails());
        System.out.println(flight.checkAvailability());
        System.out.println(flight.getBookedSeats());
    }
}
