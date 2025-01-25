package org.example.RlationsExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RunExample {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setLaptop_id(1);
        laptop.setLname("Laptop de Dante");

        Student stud = new Student();
        stud.setName("Dante");
        stud.setRollno(101);
        stud.setMarks(8);
        stud.getLaptop().add(laptop);
        laptop.getStud().add(stud);

        SessionFactory sf = new Configuration().configure().
                addAnnotatedClass(Student.class).
                addAnnotatedClass(Laptop.class).
                buildSessionFactory();

        Session session = sf.openSession();
        session.beginTransaction();

        session.save(laptop);
        session.save(stud);

        session.getTransaction().commit();
    }
}
