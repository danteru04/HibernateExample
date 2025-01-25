package org.example;

import javax.imageio.spi.ServiceRegistry;

public class Main {

    public static void main(String[] args)
    {
//        Alien dante = new Alien();
//        dante.setAlienName("Dante");
//        dante.setAlienId(101);
//        dante.setColor("Tan");
//
//        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
//        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry
//
//        SessionFactory sf = con.buildSessionFactory(reg);
//
//        Session session = sf.openSession();
//

        HibernateTransactions transact = new HibernateTransactions();
        transact.setUp();
        Alien alien = new Alien();
        //System.out.println(alien);
        //transact.saveMyFirstObjectToTheDb();
        alien = transact.FetchAlien(Alien.class, 102);

        System.out.println(alien.toString());
    }

}