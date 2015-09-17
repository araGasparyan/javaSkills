/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirsthibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Ara
 */
public class MyFirstHibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       UserDet u1=new UserDet();
        UserDet u2=new UserDet();
        u1.setUserId(1);
        u1.setUserName("Valod1");
        SessionFactory sessionfactory=new Configuration().configure("/res/hibernate.cfg.xml").buildSessionFactory();
        Session session=sessionfactory.openSession();
        session.beginTransaction();
        session.save(u1);
        session.getTransaction().commit();
        session.close();
    }
    
}
