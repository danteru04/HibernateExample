package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateTransactions {

    private static SessionFactory sessionFactory;

    protected void setUp() {
        // A SessionFactory is set up once for an application!
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    protected void tearDown() throws Exception{
        if (sessionFactory != null)
            sessionFactory.close();
    }

    public void saveMyFirstObjectToTheDb(){
        AlienName name = new AlienName("Dante", "Reyes Ugalde", "Isaac");
        Alien alien = new Alien(103, name, "verde");

        try (Session session = sessionFactory.openSession();){
            Transaction transact = session.beginTransaction();

            //session.persist(alien);
            session.save(alien);

            transact.commit();
        }
        catch (Exception e){

        }
    }

    public <T> T FetchAlien(Class<T> clazz ,int ID){

        T alien = null;

        try (Session session = sessionFactory.openSession();){
            Transaction transact = session.beginTransaction();

            alien = session.get(clazz, ID);

            transact.commit();
        }
        catch (Exception e){
            System.out.println("Error: ");
            e.printStackTrace();
        }

        return alien;
    }
}
