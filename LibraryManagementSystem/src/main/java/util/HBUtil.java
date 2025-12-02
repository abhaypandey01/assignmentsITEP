package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HBUtil {
    static {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    private static final SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void close(){
        sessionFactory.close();
    }
}
