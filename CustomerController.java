package com.example.lab3;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {
    private ArrayList<Customer>  customers = new ArrayList<Customer>();


    public CustomerController(){
        customers.add(new Customer("1010","John","Male",25));
        customers.add(new Customer("1018","Peter","Male",24));
        customers.add(new Customer("1019","Sara","Female",23));
        customers.add(new Customer("1110","Rose","Female",23));
        customers.add(new Customer("1001","Emma","Female",30));

    }

    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public List<Customer> getCustomers(){
        return customers;

    }
    @RequestMapping(value= "/customerbyid/{id}",method = RequestMethod.GET)
    public Customer getCustomerByID(@PathVariable("id") String id){
        for (Customer customer: customers) {
            if(customer.getID().equals(id)){
                return customer;
            }
        }
        return null;
    }
    @RequestMapping(value = "/customerbyname/{n}",method = RequestMethod.GET)
    public Customer getCustomerByName(@PathVariable("n") String n){
        for (Customer customer: customers){
            if(customer.getName().equals(n)){
                return customer;
            }
        }
        return null;
    }
    @RequestMapping(value = "/customerDelByid/{ID}", method = RequestMethod.DELETE)
    public boolean delCustomerByID(@PathVariable("ID")String ID){
        for (Customer customer: customers){
            if(customer.getID().equals(ID)){
                customers.remove(customer);
                return true;
            }
        }
        return false;
    }

    @RequestMapping(value = "/customerDelByname/{n}",method = RequestMethod.DELETE)
    public boolean delCustomerByName(@PathVariable("n") String n){
        for (Customer customer: customers){
            if(customer.getName().equals(n)){
                customers.remove(customer);
                return true;
            }
        }
        return false;

    }

    //    @RequestMapping(value = "/divide", method = RequestMethod.GET)
//    public String divide(@RequestParam("num1") double num1, @RequestParam("num2") double num2){
//        return Double.toString(num1/num2);
//    }
    @RequestMapping(value="/addCustomer", method = RequestMethod.GET)
    public boolean addCustomer(@RequestParam("ID") String ID,@RequestParam("n") String n,@RequestParam("s") String s,@RequestParam("a")int a){
        customers.add(new Customer(ID,n,s,a));
        return true;
    }
    @RequestMapping(value="/addCustomer2", method = RequestMethod.POST)
    public boolean addCustomer2(@RequestParam("ID") String ID,@RequestParam("n") String n,@RequestParam("s") String s,@RequestParam("a")int a){
        customers.add(new Customer(ID,n,s,a));
        return true;
    }

}