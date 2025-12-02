package Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HBUtil {
    static {
        factory = new Configuration().configure().buildSessionFactory();
    }

    private static final SessionFactory factory;

    public static SessionFactory getFactory() {
        return factory;
    }

    public static void close(){
        factory.close();
    }
}
