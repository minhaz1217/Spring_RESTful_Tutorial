/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.minhaz1217.spring_RESTful_Tutorial.bootstrap;

import io.github.minhaz1217.spring_RESTful_Tutorial.domain.Customer;
import io.github.minhaz1217.spring_RESTful_Tutorial.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author Minhaz
 */
@Component
public class BootStrapData implements CommandLineRunner{
    private final CustomerRepository customerRepository;
    public BootStrapData(CustomerRepository customerRep){
        this.customerRepository = customerRep;
    }
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Loading customer data");
        
        Customer c1 = new Customer();
        c1.setFirstName("Minhaz");
        c1.setLastName("Khan");
        customerRepository.save(c1);
        
        Customer c2 = new Customer();
        c1.setFirstName("Ishmat");
        c1.setLastName("Parween");
        customerRepository.save(c2);
        
        Customer c3 = new Customer();
        c1.setFirstName("Abrar");
        c1.setLastName("Hossain");
        customerRepository.save(c3);
        
        System.out.println("Customer saved: "+ customerRepository.count());
        
    }
    
}
