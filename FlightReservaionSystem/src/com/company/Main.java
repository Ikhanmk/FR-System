package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Passenger passenger=new Passenger(12,"Avalahalli","Bangalore","karnataka","Imran","9696367887","ikhan@gmail.com");
        System.out.println(passenger.getContactDetails());
        System.out.println(passenger.getAddress());

        Flight flight=new Flight("A99","Indigo",300,250,250);
        System.out.println(flight.getFlightDetails());
        System.out.println(flight.checkAvailability());
    }
}
