


package com.truonghan.sitemonitoring.beckend.test;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.truonghan.sitemonitoring.backend.model.Check;
import com.truonghan.sitemonitoring.backend.services.CheckService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:META-INF/backend-context.xml")
@TransactionConfiguration(defaultRollback=false)
public class DaoTest {

	@Autowired
	CheckService checkService;
	
	@Test
	public void test() {
//		Check check = new Check();
//		check.setName("test");
//		check.setUrl("test");
//		checkService.save(check);
		List<Check> checks = checkService.findAll();
		
		
	}

}

