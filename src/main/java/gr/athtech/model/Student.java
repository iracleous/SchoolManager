package gr.athtech.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Student {
    @Id
    private int id;
    private String name;
    private String address;

    @OneToMany
    private List<Course> courses;
}
