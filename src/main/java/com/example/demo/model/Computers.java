package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "computers")

public class Computers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String model;
    private String descriptions;
    private Integer year;

    public Computers() {
    }

    public Computers(Long id, String brand, String model, String descriptions, Integer year) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.descriptions = descriptions;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String discriptions) {
        this.descriptions = discriptions;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
