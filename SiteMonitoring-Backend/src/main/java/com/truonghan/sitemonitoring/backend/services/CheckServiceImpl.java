package com.truonghan.sitemonitoring.backend.services;

import java.util.List;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truonghan.sitemonitoring.backend.daos.CheckDao;
import com.truonghan.sitemonitoring.backend.model.Check;

@Service(value="checkServiceImpl")
public class CheckServiceImpl implements CheckService {

	@Autowired
	CheckDao checkDao;
	
	public List<Check> findAll() {
		return checkDao.findAll();
	}

	public Check save(Check check) {
		
		return checkDao.save(check);
	}

	public void delete(Check check) {
		checkDao.delete(check);
		
	}
}
