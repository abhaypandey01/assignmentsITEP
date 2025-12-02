package org.example;

import DAO.CourseDao;
import DAO.StudentDao;
import Entity.Course;
import Entity.Student;

public class App {
    public static void main(String[] args) {
        Student student = new Student();
        Course course = new Course();

        student.setName("James Bond");
        student.setEmail("james@email.com");
//        student.setAge(35);

        course.setCourseName("Java");
//        course.setDescription("Core Java course");
//        course.setDurationMonths(3);

        // Create
        StudentDao.create(student);
        CourseDao.create(course);

        // Enroll (IDs assume first entries, adapt if your DB autonumbers differently)
        StudentDao.enrollInCourse(student.getId(), course.getId());

        // Read
        System.out.println("All students: " + StudentDao.getAll());
        System.out.println("Search by name: " + StudentDao.getByName("Bond"));

        // Leave course
//        StudentDao.leaveCourse(student.getId(), course.getId());

        // Delete course then student (safe removal)
//        CourseDao.delete(course.getId());
//        StudentDao.deleteById(student.getId());
    }
}
