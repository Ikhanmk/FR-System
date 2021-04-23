package com.company;

public class Passenger {
    int id;
    String addressStreet;
    String addressCity;
    String addressState;

    String contactName;
    String contactPhone;
    String contactEmail;
    public Passenger(int id,String addressStreet,String addressCity,String addressState,String contactName,String contactPhone,String contactEmail)
    {
        this.id=id;
        this.addressStreet=addressStreet;
        this.addressCity=addressCity;
        this.addressState=addressState;
        this.contactName=contactName;
        this.contactPhone=contactPhone;
        this.contactEmail=contactEmail;
    }
    public String getContactDetails()
    {
        return contactName + ", " + contactPhone + ", " + contactEmail;
    }
    public String getAddress()
    {
        return addressStreet+","+addressCity+","+addressState;
    }
}
