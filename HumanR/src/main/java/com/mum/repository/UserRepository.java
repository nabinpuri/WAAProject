package com.mum.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mum.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
