package edu.northwestern.caesar.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by LT on 2018/11/12
 */
@Getter
@Setter
@Entity
@Table(name = "Students")
public class Students extends BaseEntity{


    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    @Column(name = "address")
    private String address;
}
