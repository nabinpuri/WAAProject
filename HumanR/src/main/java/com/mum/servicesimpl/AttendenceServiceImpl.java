package com.mum.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mum.domain.Attendance;
import com.mum.repository.AttendenceRepository;
import com.mum.services.AttendenceService;

@Service
@Transactional
public class AttendenceServiceImpl implements AttendenceService {
	@Autowired
	AttendenceRepository attendenceRepositorys;

	public List<Attendance> getAll() {
		// TODO Auto-generated method stub
		return (List<Attendance>) attendenceRepositorys.findAll();
	}

	public Attendance getOneByPRimaryId(Long id) {
		// TODO Auto-generated method stub
		return attendenceRepositorys.findOne(id);
	}

	public int save(Attendance entity) {
		// TODO Auto-generated method stub
		attendenceRepositorys.save(entity);
		return 0;
	}

	public boolean delete(Attendance entity) {
		// TODO Auto-generated method stub
		attendenceRepositorys.delete(entity);
		return false;
	}

}
