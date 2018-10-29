/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.minhaz1217.spring_RESTful_Tutorial.service;

import io.github.minhaz1217.spring_RESTful_Tutorial.domain.Customer;
import java.util.List;

/**
 *
 * @author Minhaz
 */
public interface CustomerService {
    Customer FindCustomerById(Long id);
    List<Customer> findAllCustomer();

    public Customer saveCustomer(Customer customer);

}
