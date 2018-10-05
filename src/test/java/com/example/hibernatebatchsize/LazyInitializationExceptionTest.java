package com.example.hibernatebatchsize;

import com.example.hibernatebatchsize.entity.Employee;
import com.example.hibernatebatchsize.repository.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mtumilowicz on 2018-10-03.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class LazyInitializationExceptionTest {
    
    @Autowired
    EmployeeRepository repository;
    
    @Test
    @Transactional
    public void withBatch() {
        Employee employee1 = repository.findById(1).get();
        Employee employee2 = repository.findById(2).get();
        Employee employee3 = repository.findById(3).get();
        
        employee1.getIssues().forEach(System.out::println);
        employee2.getIssues().forEach(System.out::println);
        employee3.getIssues().forEach(System.out::println);
    }

    @Test
    @Transactional
    public void withoutBatch() {
        Employee employee1 = repository.findById(1).get();
        Employee employee2 = repository.findById(2).get();
        Employee employee3 = repository.findById(3).get();

        employee1.getIssues2().forEach(System.out::println);
        employee2.getIssues2().forEach(System.out::println);
        employee3.getIssues2().forEach(System.out::println);
    }
    
}
