package org.example;

import jakarta.persistence.*;

@Entity
@Table(name = "Alien")
public class Alien {

    @Id
    private int alienId;
    private AlienName alienName;
    @Column(name = "alienColor")
    private String color;

    public Alien(){

    }

    public Alien(int id, AlienName name, String color){
        setAlienName(name);
        setAlienId(id);
        setColor(color);
    }

    public AlienName getAlienName() {
        return alienName;
    }

    public void setAlienName(AlienName alienName) {
        this.alienName = alienName;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAlienId(int alienId) {
        this.alienId = alienId;
    }

    public String getColor() {
        return color;
    }

    public int getAlienId() {
        return alienId;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "alienId=" + alienId +
                ", alienName='" + alienName + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
