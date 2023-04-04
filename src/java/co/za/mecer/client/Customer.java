/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.za.mecer.client;

/**
 *
 * @author PULE
 */
public class Customer {
    
    private int client_Id;
    private int deliveryAddress_Id;
    private int paymentType_Id;
    private String title;
    private String First_Name;
    private String surname;
    private String id_Number;
    private String phone;
    private String email_Address;
    private String Password;

    public Customer() {
    }

    

    
    public Customer(int client_Id, int deliveryAddress_Id, int paymentType_Id, String title, String First_Name, String surname, String id_Number, String phone, String email_Address, String Password) {
        this.client_Id = client_Id;
        this.deliveryAddress_Id = deliveryAddress_Id;
        this.paymentType_Id = paymentType_Id;
        this.title = title;
        this.First_Name = First_Name;
        this.surname = surname;
        this.id_Number = id_Number;
        this.phone = phone;
        this.email_Address = email_Address;
        this.Password = Password;
    }



    public Customer( String email_Address, String Password) {
        
        this.email_Address = email_Address;
        this.Password = Password;
    }


    public Customer(String title, String First_Name, String surname, String id_Number, String phone, String email_Address, String Password) {
        this.title = title;
        this.First_Name = First_Name;
        this.surname = surname;
        this.id_Number = id_Number;
        this.phone = phone;
        this.email_Address = email_Address;
        this.Password = Password;
    }

    public int getClient_Id() {
        return client_Id;
    }

    public void setClient_Id(int client_Id) {
        this.client_Id = client_Id;
    }

    public int getDeliveryAddress_Id() {
        return deliveryAddress_Id;
    }

    public void setDeliveryAddress_Id(int deliveryAddress_Id) {
        this.deliveryAddress_Id = deliveryAddress_Id;
    }

    public int getPaymentType_Id() {
        return paymentType_Id;
    }

    public void setPaymentType_Id(int paymentType_Id) {
        this.paymentType_Id = paymentType_Id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String First_Name) {
        this.First_Name = First_Name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getId_Number() {
        return id_Number;
    }

    public void setId_Number(String id_Number) {
        this.id_Number = id_Number;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail_Address() {
        return email_Address;
    }

    public void setEmail_Address(String email_Address) {
        this.email_Address = email_Address;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    @Override
    public String toString() {
        return "Customer{" + "client_Id=" + client_Id + ", deliveryAddress_Id=" + deliveryAddress_Id + ", paymentType_Id=" + paymentType_Id + ", title=" + title + ", First_Name=" + First_Name + ", surname=" + surname + ", id_Number=" + id_Number + ", phone=" + phone + ", email_Address=" + email_Address + ", Password=" + Password + '}';
    }    
    
}
