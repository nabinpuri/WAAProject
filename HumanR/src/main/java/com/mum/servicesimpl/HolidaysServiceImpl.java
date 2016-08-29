package com.mum.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mum.domain.Attendance;
import com.mum.repository.HolidaysRepository;
import com.mum.services.HolidaysService;
@Service
@Transactional
public class HolidaysServiceImpl implements HolidaysService{
	@Autowired
	HolidaysRepository holidayRepository;
	public List<Attendance> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Attendance getOneByPRimaryId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int save(Attendance entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean delete(Attendance entity) {
		// TODO Auto-generated method stub
		return false;
	}

}
