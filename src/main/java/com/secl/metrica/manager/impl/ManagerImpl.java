package com.secl.metrica.manager.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.secl.metrica.db.dao.HibernateDao;
import com.secl.metrica.db.dao.SimpleJdbcDao;
import com.secl.metrica.db.dao.SpringJdbcDao;
import com.secl.metrica.entity.AbstractEntity;
import com.secl.metrica.manager.IDGenerator;
import com.secl.metrica.manager.Manager;
import com.secl.metrica.manager.QueryManager;
import com.secl.metrica.manager.SessionManager;


public class ManagerImpl implements Manager {
	
	protected SessionManager sessionManager;
	protected QueryManager queryManager;
	protected IDGenerator idGenerator;
	protected HibernateDao hibernateDao;
	protected SpringJdbcDao springJdbcDao;
    protected SimpleJdbcDao simpleJdbcDao;    
    protected DriverManagerDataSource dataSource;
	protected List<AbstractEntity> entityList = new ArrayList<AbstractEntity>();

	public void setHibernateDao(HibernateDao hibernateDao) {
		this.hibernateDao = hibernateDao;
	}

	public void setIdGenerator(IDGenerator idGenerator) {
		this.idGenerator = idGenerator;
	}

	public void setSpringJdbcDao(SpringJdbcDao springJdbcDao) {
		this.springJdbcDao = springJdbcDao;
	}

	public void setSimpleJdbcDao(SimpleJdbcDao simpleJdbcDao) {
		this.simpleJdbcDao = simpleJdbcDao;
	}

	public void setQueryManager(QueryManager queryManager) {
		this.queryManager = queryManager;
	}

	public void setSessionManager(SessionManager sessionManager) {
		this.sessionManager = sessionManager;
	}

	public void setDataSource(DriverManagerDataSource dataSource) {
		this.dataSource = dataSource;
	}

	

}
