package com.xworkz.motorola.entity;


import javax.persistence.*;

@Entity
@Table(name="motorola")

public class MotorolaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="brand")
    private String brand;
    private  int price;
    private  int battery;
    private int ram;

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

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "MotorolaEntity{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", battery=" + battery +
                ", ram=" + ram +
                '}';
    }

    public MotorolaEntity(String brand, int price, int battery, int ram) {
        this.brand = brand;
        this.price = price;
        this.battery = battery;
        this.ram = ram;
    }
}
