package com.company;

public class Address {
    String street;
    String city;
    String state;
    public Address(String street,String city,String state)
    {
        this.street=street;
        this.city=city;
        this.state=state;
    }

    public String getAddressDetails()
    {
        return street+","+city+","+state;

    }
  //  public void updateAddressDetails(String addressDetails)
    {

    }
}
