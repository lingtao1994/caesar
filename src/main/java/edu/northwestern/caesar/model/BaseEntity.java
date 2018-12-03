package edu.northwestern.caesar.model;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author LT
 * @Date on 2018/12/1
 */
@Data
@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

}
