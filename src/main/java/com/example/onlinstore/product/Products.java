package com.example.onlinstore.product;

import com.example.onlinstore.seller.Seller;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private Double price;
    private Double weight;
    private Integer amount;
    @ManyToOne(cascade = CascadeType.ALL)
    private Seller seller;

}
