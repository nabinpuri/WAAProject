package com.mum.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mum.domain.Attendance;

@Repository
public interface AttendenceRepository extends CrudRepository<Attendance,Long> {

}
