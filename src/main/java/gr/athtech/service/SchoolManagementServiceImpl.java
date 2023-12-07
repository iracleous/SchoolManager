package gr.athtech.service;

import gr.athtech.model.Student;
import gr.athtech.model.Teacher;
import gr.athtech.repository.ComponentRepository;
import gr.athtech.repository.ComponentRepositoryImpl;

public class SchoolManagementServiceImpl implements SchoolManagementService{

    private ComponentRepository<Student> students =
            new ComponentRepositoryImpl<>();

    private ComponentRepository<Teacher> teachers =
            new ComponentRepositoryImpl<>();

    @Override
    public void enrollStudent(String studentName, String studentAddress) {
        Student student = new Student();
        student.setName(studentName) ;
        student.setAddress(studentAddress);
        students.addItem(student);
    }

    @Override
    public void enrollTeacher(String teacherName, String teacherAddress) {
        Teacher teacher = new Teacher();
        teacher.setName(teacherName) ;
        teacher.setAddress(teacherAddress);
        teachers.addItem(teacher);
    }

    @Override
    public void assignCourseToStudent(int studentId, int courseId) {

    }

    @Override
    public void assignCourseToTeacher(int teacherId, int courseId) {

    }
}
