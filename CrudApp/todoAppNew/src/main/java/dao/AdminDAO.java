package dao;

import entity.Admin;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;
import util.DBConnection;

import java.util.List;

public class AdminDAO {
    private static final EntityManagerFactory factory = DBConnection.getFactory();

    public static Admin getAdmin(Admin admin) {
        EntityManager em = factory.createEntityManager();
        try{
            em.getTransaction().begin();

            String hql = "from Admin where email=:email and password=:password";
            TypedQuery<Admin> query = em.createQuery(hql, Admin.class);
            query.setParameter("email", admin.getEmail());
            query.setParameter("password", admin.getPassword());
            List<Admin> admins = query.getResultList();

            Admin admin1 = admins.isEmpty() ? null : admins.get(0);

            if(admin1 != null){
                return admin1;
            }

            em.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            em.close();
        }
        return null;
    }
}
