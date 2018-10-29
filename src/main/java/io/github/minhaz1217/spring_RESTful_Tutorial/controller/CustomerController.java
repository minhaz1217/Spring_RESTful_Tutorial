/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.minhaz1217.spring_RESTful_Tutorial.controller;

import io.github.minhaz1217.spring_RESTful_Tutorial.domain.Customer;
import io.github.minhaz1217.spring_RESTful_Tutorial.service.CustomerService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Minhaz
 */
@RestController
@RequestMapping(CustomerController.BASE_URL)
public class CustomerController {
    public static final String BASE_URL = "/api/v1/customers";
    private final CustomerService customerService;
    public CustomerController(CustomerService cs){
        this.customerService = cs;
    }
    @GetMapping
    List<Customer> getAllCustomer(){
        return customerService.findAllCustomer();
    }
    
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id){
        return customerService.FindCustomerById(id);
    }
        
      

}
