package com.company;

public class Contact
{
    public String name;
    public String phone;
    public String email;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }


    public String getContactDetails()
     {
         return name+","+phone+","+email;

     }
   //  public void updateContactDetails(String contactDetail)
     {

     }

}
