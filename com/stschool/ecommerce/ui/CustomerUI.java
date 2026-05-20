package com.stschool.ecommerce.ui;

import com.stschool.ecommerce.model.Customer;

import java.util.Scanner;

public class CustomerUI {
    public Customer displaySignUpForm(){
        System.out.println("Customer Registration Form");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id: ");
        int id = sc.nextInt();
        System.out.println("Enter name: ");
        String name = sc.next();
        System.out.println("Enter Email: ");
        String email = sc.next();
        System.out.println("Enter Password: ");
        String password = sc.next();
        System.out.println("Enter phone number: ");
        String phone = sc.next();
        Customer customer=new Customer();
        customer.setId(id);
        customer.setName(name);
        customer.setEmail(email);
        customer.setPassword(password);
        customer.setPhone(phone);

        return customer;


    }

}
