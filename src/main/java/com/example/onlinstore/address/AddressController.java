package com.example.onlinstore.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")

public class AddressController {
    @Autowired
    AddressService addressService;
    @PostMapping("/save")
    public void saveAddress(@RequestBody Address address){
        addressService.saveAddress(address);

    }
}
