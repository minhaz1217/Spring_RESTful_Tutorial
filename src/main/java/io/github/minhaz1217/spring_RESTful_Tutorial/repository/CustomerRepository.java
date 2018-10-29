/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.minhaz1217.spring_RESTful_Tutorial.repository;

import io.github.minhaz1217.spring_RESTful_Tutorial.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Minhaz
 */
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    
}
