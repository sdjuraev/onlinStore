package com.example.onlinstore.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping("save")
    public void save(@RequestBody Products products){
        productService.saveProduct(products);
    }
    @GetMapping("getList")
    public List<Products> getProduct(){
        return productService.getProductList();

    }
    @GetMapping("getProduct/{id}")
    public Optional<Products> getSingleProduct(@PathVariable Long id){
        return productService.getProductByID(id);
    }
    @PutMapping("update")
    public void update(@RequestBody Products products){
        productService.updateProduct(products);
    }







}
