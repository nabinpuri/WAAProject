package com.mum.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mum.domain.*;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {

}
