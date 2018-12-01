package edu.northwestern.caesar.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author LT
 * @Date on 2018/12/1
 */

@Data
@Entity
@Table(name = "courses")
public class Course extends BaseEntity{

    @Column(name = "uoscode")
    private String uosCode;

    @Column(name = "semester")
    private String semester;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "courses" )
    private Set<Course> courses = new HashSet<>();
}
