package org.example;

import dao.UserDao;
import entity.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        User user = null;
//        user.setName("Aman");
//        user.setEmail("aman@email.com");
//        user.setPassword("12345");
//        UserDao.create(user);

        String query = "aman";

        user = UserDao.getUserByQuery(query);
        System.out.println(user);

//        if(UserDao.verify(user)){
//            System.out.println("User has been verified");
//        }else {
//            System.out.println("User has NOT been verified");
//        }

        if(UserDao.deleteUserByQuery(query)){
            System.out.println("User has been deleted");
        }else {
            System.out.println("User has NOT been deleted");
        }
    }
}
