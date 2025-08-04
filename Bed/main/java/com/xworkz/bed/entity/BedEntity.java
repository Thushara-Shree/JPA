package com.xworkz.bed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "football")
public class BedEntity {

    @Id
    private int id;
    @Column(name = "playername")
    private String playerName;

    private String stadium;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public BedEntity(int id, String playerName, String stadium) {
        this.id = id;
        this.playerName = playerName;
        this.stadium = stadium;
    }

    @Override
    public String toString() {
        return "BedEntity{" +
                "id=" + id +
                ", playerName='" + playerName + '\'' +
                ", stadium='" + stadium + '\'' +
                '}';
    }
}
