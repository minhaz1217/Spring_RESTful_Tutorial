/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.minhaz1217.spring_RESTful_Tutorial.service;

import io.github.minhaz1217.spring_RESTful_Tutorial.domain.Customer;
import io.github.minhaz1217.spring_RESTful_Tutorial.repository.CustomerRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    public CustomerServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    } 
    @Override
    public Customer FindCustomerById(Long id) {
        return customerRepository.findById(id).get();
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Customer> findAllCustomer() {
        return customerRepository.findAll();
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
