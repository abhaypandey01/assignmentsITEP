package util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DBUtil {

    static{
            factory = Persistence.createEntityManagerFactory("JPAApp");
    }

    private static final EntityManagerFactory factory;

    public static EntityManagerFactory getFactory(){
        return factory;
    }

    public static void close(){
        factory.close();
    }
}
