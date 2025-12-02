package dao;

import entity.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jpautil.JpaUtil;

public class CourseDao {
    private static EntityManagerFactory emf = JpaUtil.getEntityManagerFactory() ;

    public static void create(Course course) {
        EntityManager em = emf.createEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(course);
            em.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            em.close();
        }
    }
}
