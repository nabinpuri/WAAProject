package com.mum.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mum.domain.Attendance;

@Repository
public interface AttendenceRepository extends CrudRepository<Attendance,Long> {

}
