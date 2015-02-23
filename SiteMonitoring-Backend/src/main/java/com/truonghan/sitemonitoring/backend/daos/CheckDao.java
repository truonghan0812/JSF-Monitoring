package com.truonghan.sitemonitoring.backend.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.truonghan.sitemonitoring.backend.model.Check;

public interface CheckDao extends JpaRepository<Check, Integer>{

}
