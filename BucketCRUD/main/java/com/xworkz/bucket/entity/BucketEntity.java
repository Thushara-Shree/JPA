package com.xworkz.bucket.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Football")

public class BucketEntity {


    @Id
    private int id;
    @Column(name = "quantity")
    private int quantity;
    private String material;
    private String brand;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BucketEntity(int id, int quantity, String material, String brand) {
        this.id = id;
        this.quantity = quantity;
        this.material = material;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "BucketEntity{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", material='" + material + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
