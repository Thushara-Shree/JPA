package com.xworkz.bag.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pickle_table")
public class BagEntity {
    @Id
    private int id;

    @Column(name = "company")
    private String companyName;

    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BagEntity(int id, String companyName, String type) {
        this.id = id;
        this.companyName = companyName;
        this.type = type;
    }

    @Override
    public String toString() {
        return "BagEntity{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
