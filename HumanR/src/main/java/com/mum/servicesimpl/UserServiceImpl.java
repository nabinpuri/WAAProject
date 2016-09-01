package com.mum.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mum.domain.User;
import com.mum.repository.UserRepository;
import com.mum.services.UserService;
@Service
@Transactional
public class UserServiceImpl implements UserService {
@Autowired
UserRepository userRepository;
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getOneByPRimaryId(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findOne(id);
	}

	@Override
	public int save(User entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean delete(User entity) {
		// TODO Auto-generated method stub
		return false;
	}

}
