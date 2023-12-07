package gr.athtech.service;

public interface SchoolManagementService {
    void enrollStudent(String studentName, String studentAddress);
    void enrollTeacher(String teacherName, String teacherAddress);

    void assignCourseToStudent(int studentId, int courseId);
    void assignCourseToTeacher(int teacherId, int courseId);
}
