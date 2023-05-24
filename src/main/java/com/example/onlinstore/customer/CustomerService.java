package com.example.onlinstore.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Date;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public void saveCustomer(Customer customer){
        customer.setDBO(new Date());
        customerRepository.save(customer);
    }
    public Optional<Customer> getCustomer(Long ID){

            return customerRepository.findById(ID);

    }



}
