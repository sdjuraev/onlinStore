package com.example.onlinstore.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    AddressRepository addressRepository;
    public void saveAddress(Address address) {

        addressRepository.save(address);
    }
    public void saveAllAddress(List<Address> addressList)
    {
        addressRepository.saveAll(addressList);
    }
}
