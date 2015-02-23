package com.truonghan.sitemonitoring.backend.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.truonghan.sitemonitoring.backend.model.Check;


public interface CheckService {

	List<Check> findAll();
	Check save(Check check);
	void delete (Check check);
}
