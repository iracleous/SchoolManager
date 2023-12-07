package gr.athtech;

import gr.athtech.model.Course;
import gr.athtech.model.Student;
import gr.athtech.model.Teacher;
import gr.athtech.repository.ComponentRepository;
import gr.athtech.repository.ComponentRepositoryImpl;
import gr.athtech.service.SchoolManagementService;
import gr.athtech.service.SchoolManagementServiceImpl;

public class Main {
    public static void main(String[] args) {
        //Case study
//We test all the use cases

        //initialization parts
        ComponentRepository<Student> students = new ComponentRepositoryImpl<>();
        ComponentRepository<Teacher> teachers = new ComponentRepositoryImpl<>();
        ComponentRepository<Course> courses = new ComponentRepositoryImpl<>() ;

        SchoolManagementService service =
                new SchoolManagementServiceImpl(students, teachers, courses);


        //user calls
        service.courseCreate("Java Programming");
        service.courseCreate("Databases");

        service.enrollStudent("Dimitris", "Athens");
        service.enrollStudent("John", "Athens");

        service.enrollTeacher("Iracleous", "Athens");

       try {
           service.assignCourseToStudent(1, 2);

           service.assignCourseToTeacher(1, 2);
       }
       catch(Exception e)
       {
           System.out.println("Exception occurred "+ e.getMessage());
       }

       service.report();
    }
}