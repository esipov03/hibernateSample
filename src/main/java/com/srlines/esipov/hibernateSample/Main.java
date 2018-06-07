package com.srlines.esipov.hibernateSample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CRM");
        EntityManager em = emf.createEntityManager();
        Student st = new Student();
        st.setName("adeasd");
        st.setAge(22);

        em.getTransaction().begin();
        em.persist(st);
        em.getTransaction().commit();
        System.out.println("HERE: " + em.createNativeQuery("SELECT * FROM student WHERE id =4 ", Student.class).getSingleResult().toString());


    }
}
