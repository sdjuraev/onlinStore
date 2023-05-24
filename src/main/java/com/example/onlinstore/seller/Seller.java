package com.example.onlinstore.seller;

import com.example.onlinstore.product.Products;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String password;
    private Double balance;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Products> products;
}
