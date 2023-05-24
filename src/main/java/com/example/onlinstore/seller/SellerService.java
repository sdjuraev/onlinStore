package com.example.onlinstore.seller;

import com.example.onlinstore.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SellerService {

    @Autowired
    SellerRepository sellerRepository;
    @Autowired
    ProductRepository productRepository;
    public void saveSeller(Seller seller){
        productRepository.saveAll(seller.getProducts());
        sellerRepository.save(seller);
    }
    public Optional<Seller> getSeller(Long ID){
        return sellerRepository.findById(ID);
    }

}
