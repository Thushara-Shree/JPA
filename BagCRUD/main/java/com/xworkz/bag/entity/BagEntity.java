package com.xworkz.bag.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bagTable")
public class BagEntity {
    @Id
    @Column(name = "idBag")
    private int id;
    private String brand;
    private int price;

    @Column(name = "no_of_zip")
    private int noOfZip;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNoOfZip() {
        return noOfZip;
    }

    public void setNoOfZip(int noOfZip) {
        this.noOfZip = noOfZip;
    }

    @Override
    public String toString() {
        return "BagEntity{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", noOfZip=" + noOfZip +
                '}';
    }

    public BagEntity(int id, String brand, int price, int noOfZip) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.noOfZip = noOfZip;
    }
}
