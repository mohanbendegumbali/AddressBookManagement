package com.address.book;


public class Contact {
    public static void main(String[] args) {
       System.out.println("By Mistake An Engineer");

    }
}

class Contact{
    private String name;
    private String last_N;
    private String city;
    private String number;
    private String email;

    public Contact(String name,String lasttN,String city,String number,String email){
        this.name = name;
        this.last_N = lasttN;
        this.city = city;
        this.number = number;
        this.email = email;
    }

}