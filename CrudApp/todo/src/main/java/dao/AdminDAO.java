package dao;

import entity.Admin;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;
import util.DBUtil;

public class AdminDAO {
    private static final EntityManagerFactory factory = DBUtil.getFactory();

    public static Admin getAdmin(Admin admin){
        EntityManager em = factory.createEntityManager();
        try{
            em.getTransaction().begin();
            TypedQuery<Admin> query = em.createQuery("from Admin where email=:email and password=:password", Admin.class);
            query.setParameter("email", admin.getEmail());
            query.setParameter("password", admin.getPassword());
            Admin admin1 = query.getResultStream().findFirst().orElse(null);

            em.getTransaction().commit();
            return admin1;

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            em.close();
        }
        return null;
    }
}
