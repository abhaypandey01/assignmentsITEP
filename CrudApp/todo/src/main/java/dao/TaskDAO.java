package dao;

import entity.Task;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;
import util.DBUtil;

import java.util.List;

public class TaskDAO {
    private static EntityManagerFactory factory = DBUtil.getFactory();

    public static boolean addTask(Task t){
        EntityManager em = factory.createEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(t);
            em.getTransaction().commit();
            return true;
        }catch(Exception e){
            e.printStackTrace();

        }finally{
            em.close();
        }
        return false;
    }

    public static boolean deleteTask(int id){
        EntityManager em = factory.createEntityManager();
        try{
            em.getTransaction().begin();
            Task t = em.find(Task.class, id);
            em.remove(t);
            em.getTransaction().commit();
            return true;
        }catch(Exception e){
            e.printStackTrace();

        }finally{
            em.close();
        }
        return false;
    }

    public static List<Task> getTasks() {
        EntityManager em = factory.createEntityManager();
        try{
            em.getTransaction().begin();
            TypedQuery<Task> query = em.createQuery("from Task", Task.class);
            List<Task> tasks = query.getResultList();
            return tasks;
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            em.close();
        }
        return null;
    }
}
