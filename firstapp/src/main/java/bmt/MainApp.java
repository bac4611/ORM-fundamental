package bmt;

import bmt.User;
import bmt.Product;
import jakarta.persistence.*;

public class MainApp {
    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("demoPU");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        User u = new User("BMT", "bmt@gmail.com");
        em.persist(u);

        Product p = new Product( "my hao hao", 1330);
        em.persist(p);

        em.getTransaction().commit();
        em.close();
        emf.close();
        System.out.println("Insert thanh cong!");

    }
}
