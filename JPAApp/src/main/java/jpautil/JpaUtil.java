package jpautil;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil {

    static {
        emf  = Persistence.createEntityManagerFactory("JPAApp");
    }

    private static EntityManagerFactory emf;

    public static EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }

    public static void close(){
        emf.close();
    }
}
