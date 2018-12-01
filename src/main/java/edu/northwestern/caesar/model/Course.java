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
@Table(name = "Courses")
public class Courses extends BaseEntity{

    @Column(name = "uosCode")
    private String uosCode;

    @Column(name = "semester")
    private String semester;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "Courses" )
    private Set<Courses> courses = new HashSet<>();
}
