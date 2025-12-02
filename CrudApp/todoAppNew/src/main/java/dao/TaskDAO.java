package dao;

import entity.Task;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;
import util.DBConnection;

import java.util.List;

public class TaskDAO {
    private static final EntityManagerFactory factory = DBConnection.getFactory();

    public static boolean addTask(Task task) {
        EntityManager em = factory.createEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(task);
            em.getTransaction().commit();
            return true;
        }catch(Exception e){
            e.printStackTrace();
        }finally {
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

    public static boolean deleteTask(int id) {
        EntityManager em = factory.createEntityManager();
        try{
            em.getTransaction().begin();
            TypedQuery<Task> query = em.createQuery("from Task where id = :id", Task.class);
            query.setParameter("id", id);
            Task task = query.getResultStream().findFirst().get();
            if(task != null){
                em.remove(task);
            }
            em.getTransaction().commit();
            return true;
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            em.close();
        }
        return false;
    }

    public static boolean updateTask(Task task) {
        EntityManager em = factory.createEntityManager();
        try{
            em.getTransaction().begin();
            String jpql = "";
            return true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            em.close();
        }
        return false;
    }

}
