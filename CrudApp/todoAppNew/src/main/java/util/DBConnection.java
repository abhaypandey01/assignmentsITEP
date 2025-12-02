package util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DBConnection {
    private static EntityManagerFactory emf;

    public static EntityManagerFactory getFactory(){
        try{
            if(emf == null){
                emf = Persistence.createEntityManagerFactory("JPAApp");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return emf;
    }

    public static void close(){
        emf.close();
    }
}
