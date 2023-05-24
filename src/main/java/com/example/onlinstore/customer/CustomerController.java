package com.example.onlinstore.customer;

import com.example.onlinstore.address.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/customer")

public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
    AddressService addressService;

    @PostMapping("/save")
    public String saveCustomer(@RequestBody Customer customer){
        customerService.saveCustomer(customer);
        return "Customer save";
    }
    @GetMapping("get")
    public Optional<Customer> getCustomer(@RequestBody Customer customer){
        return customerService.getCustomer(customer.getId());
    }




}
