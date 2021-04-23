package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Flight flight = new Flight();
//
        Ticket ticket = new RegularTicket();
        printTicketDetails(ticket);
    }
            public static void printTicketDetails(Ticket ticket)
            {

            RegularTicket ticket1=new RegularTicket("ColdWater","786","Bangalore",
                    "Delhi","10:20 pm","1:00 pm","B44", ticket.getFlight(),
                    ticket.getPassenger(),1200.0f,false);

            TouristTicket ticket2=new TouristTicket("Khalifa","100","chennai",
                    "mp","11:20 pm","4:00 pm","190", ticket.getFlight(),
                    ticket.getPassenger(),3003.0f,false);
    }
}
