package gr.athtech.service;

import gr.athtech.model.Course;
import gr.athtech.model.Student;
import gr.athtech.model.Teacher;
import gr.athtech.repository.ComponentRepository;
import gr.athtech.repository.ComponentRepositoryImpl;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class SchoolManagementServiceImpl implements SchoolManagementService{

    private final ComponentRepository<Student> students;
    private final ComponentRepository<Teacher> teachers;
    private final ComponentRepository<Course> courses;

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

    public void courseCreate(String courseName)
    {
        Course course = new Course();
        course.setName(courseName);
        courses.addItem(course);
    }

    @Override
    public void assignCourseToStudent(int studentId, int courseId)
    throws Exception
    {

        Student student =
                students.getItemById(studentId);
        if (student == null){
            throw new Exception("No such student");
        }

        Course course =
                courses.getItemById(courseId);
        if (course == null){
            throw new Exception("No such course");
        }
        student.getCourses().add(course);

        students.updateItem(student);

    }

    @Override
    public void assignCourseToTeacher(int teacherId, int courseId)
            throws Exception {
        Teacher teacher =
                    teachers.getItemById(teacherId);
        Course course =
                courses.getItemById(courseId);
        teacher.getCourses().add(course);
        teachers.updateItem(teacher);
    }

    public void report(){
        List<Course> courseList = courses.getAll();
        List<Teacher>teacherList = teachers.getAll();
        List<Student> studentList = students.getAll();

        System.out.println(courseList);
        System.out.println(teacherList);
        System.out.println(studentList);
    }
}
