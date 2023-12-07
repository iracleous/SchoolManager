package gr.athtech.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Teacher {
    private int id;
    private String name;
    private String address;
    private List<Course> courses;
}
