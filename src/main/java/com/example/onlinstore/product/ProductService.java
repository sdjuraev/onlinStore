package com.example.onlinstore.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository repository;
    public void saveProduct(Products products){
        products.setName(products.getName()+" Fiction");
        repository.save(products);

    }
    public List<Products> getProductList(){
        return repository.findAll();
    }
    public Optional<Products> getProductByID(Long ID){
        return repository.findById(ID);
    }

    public void updateProduct(Products products) {
        Products tempToSave=repository.getReferenceById(products.getId());
        tempToSave.setName(products.getName());
        if (products.getPrice()>0.5){
            tempToSave.setPrice(1.0);
        }else {
            tempToSave.setName("This is a expensive BOOK");
        }

        repository.save(tempToSave);
    }
}
