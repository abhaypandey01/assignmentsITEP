package dao;

import entity.User;
import jakarta.persistence.*;
import jpautil.HashPassword;
import jpautil.JpaUtil;

import java.util.List;

public class UserDao {
    private static final EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();

    public static void create(User user) {
        EntityTransaction tx = null;
        try(EntityManager em = emf.createEntityManager()) {
            tx = em.getTransaction();
            tx.begin();
            em.persist(user);
            tx.commit();
            System.out.println("User created successfully");
        }catch(Exception e) {
            if(tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
    }

    public static boolean verify(User user){
        EntityTransaction tx = null;
        try(EntityManager em = emf.createEntityManager()) {
            tx  = em.getTransaction();
            tx.begin();
            TypedQuery<User> query = em.createQuery("from User where email=:email", User.class);
            query.setParameter("email", user.getEmail());
            List<User> list =  query.getResultList();
            if(list.isEmpty()){
                return false;
            }
            User dbUser =  list.get(0);
            tx.commit();
            return HashPassword.verifyPassword(user.getPassword(), dbUser.getPassword());
        }catch(Exception e) {
//            if(tx != null) {
//                tx.rollback();
//            }
            e.printStackTrace();
        }
        return false;
    }

    public static User getUserById(int id){
        EntityTransaction tx = null;
        User user = null;
        try(EntityManager em = emf.createEntityManager()) {
            tx =  em.getTransaction();
            tx.begin();
            user = em.find(User.class, id);
            tx.commit();
            return user;
        }catch(Exception e) {
            if(tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
    }

    public static User getUserByQuery(String query){
        EntityTransaction tx = null;
        User user = null;
        try(EntityManager em = emf.createEntityManager()) {
            String sql = "from User where name like :query or email like  :query";
            TypedQuery<User> hqlquery = em.createQuery(sql, User.class);
            hqlquery.setParameter("query", "%"+query+"%");
            List<User> list = hqlquery.getResultList();
            user = list.isEmpty()?null:list.get(0);
            return user;
        }catch(Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
    }

    public static boolean deleteUserByQuery(String query){
        EntityTransaction tx = null;
        User user = null;
        try(EntityManager em = emf.createEntityManager()) {
            tx = em.getTransaction();
            tx.begin();
            String sql = "delete from User where name like :query or email like  :query";
            Query hqlquery = em.createQuery(sql);
            hqlquery.setParameter("query", "%"+query+"%");
            hqlquery.executeUpdate();
            tx.commit();
            return true;
        }catch(Exception e) {
            e.printStackTrace();
            return false;
        }

    }

}
