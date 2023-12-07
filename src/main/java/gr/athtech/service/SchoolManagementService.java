package gr.athtech.service;

public interface SchoolManagementService {


    //List use cases
    void enrollStudent(String studentName, String studentAddress);
    void enrollTeacher(String teacherName, String teacherAddress);

    void courseCreate(String courseName);

    void assignCourseToStudent(int studentId, int courseId)  throws Exception;
    void assignCourseToTeacher(int teacherId, int courseId)  throws Exception;

    void report();
}
