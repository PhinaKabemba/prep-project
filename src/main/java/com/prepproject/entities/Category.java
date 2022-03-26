package com.prepproject.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "product_category")
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "category_name")
    private String categoryName;

    public Category(Long id, String categoryName) {
        this.id = id;
        this.categoryName = categoryName;
    }

    public Category() {
    }
}
