package com.company;

public class Main{

public static void main(String args[]){

//        Flight flight=new Flight("qw","as",23,123);
//        System.out.println(flight.getFlightDetails());
//        System.out.println(flight.checkAvailability());
//        System.out.println(flight.getBookedSeats());

//        System.out.println(printTicketDetails(ticket1.pnr));
//        System.out.println(printTicketDetails(ticket2.pnr));

//        Flight flight = new Flight();
//        System.out.println(flight.getAirline());

        Ticket ticket=new RegularTicket();
        printTicketDetails(ticket);

        }

public static void printTicketDetails(Ticket ticket){

        RegularTicket ticket1=new RegularTicket("ColdWater","PNR no: 120000","Bangalore",
        "Kashmeer","10:20 pm","1:00 pm","55", ticket.getFlight(),
        ticket.getPassenger(),500.0f,false);
        System.out.println(ticket1.getPnr());

        TouristTicket ticket2=new TouristTicket("Khalifa Hotel","PNR no: 8888","Bangalore",
        "MP","12:20 pm","3:00 pm","100", ticket.getFlight(),
        ticket.getPassenger(),600.0f,false);
        System.out.println(ticket2.getPnr());


        }
        }
