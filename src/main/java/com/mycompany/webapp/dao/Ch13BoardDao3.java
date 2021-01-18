package com.mycompany.webapp.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.mycompany.webapp.service.Ch13Service3;

@Repository
public class Ch13BoardDao3 {
	private static final Logger logger = LoggerFactory.getLogger(Ch13BoardDao3.class);
	
	
	public void select() {
		logger.info("게시물을 가져옴");
	}
}
