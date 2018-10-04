package com.example.hibernatebatchsize.repository;

import com.example.hibernatebatchsize.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mtumilowicz on 2018-10-03.
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
