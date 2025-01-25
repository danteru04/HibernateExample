package org.example.RlationsExample;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Laptop {
    @Id
    private int laptop_id;
    private String lname;
//    @ManyToOne
//    private Student stud;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Student> stud = new ArrayList<Student>();



    public int getLaptop_id() {
        return laptop_id;
    }

    public void setLaptop_id(int laptop_id) {
        this.laptop_id = laptop_id;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public List<Student> getStud() {
        return stud;
    }

    public void setStud(List<Student> stud) {
        this.stud = stud;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "laptop_id=" + laptop_id +
                ", lname='" + lname + '\'' +
                '}';
    }
}
