package com.mum.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mum.domain.Leave;
import com.mum.repository.LeaveRepository;
import com.mum.services.LeaveService;

@Service
@Transactional
public class LeaveServiceImpl implements LeaveService {
	@Autowired
  LeaveRepository leaveRepository;

	public List<Leave> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Leave getOneByPRimaryId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int save(Leave entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean delete(Leave entity) {
		// TODO Auto-generated method stub
		return false;
	}

}
