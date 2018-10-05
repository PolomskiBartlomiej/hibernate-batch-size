package com.example.hibernatebatchsize.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.BatchSize;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by mtumilowicz on 2018-10-03.
 */
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@ToString
public class Employee {
    @Id
    Integer id;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn
    @BatchSize(size = 10)
    Collection<Issue> issues;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn
    Collection<Issue> issues2;
}
