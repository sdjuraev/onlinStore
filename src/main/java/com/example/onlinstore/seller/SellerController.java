package com.example.onlinstore.seller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("seller")
public class SellerController {
    @Autowired
    SellerService sellerService;

    @PostMapping("save")
    public void save(@RequestBody Seller seller){
        sellerService.saveSeller(seller);
    }
    @GetMapping("get/{id}")
    public Optional<Seller> getSeller(@PathVariable Long id){
        return sellerService.getSeller(id);
    }

}
