package com.secl.metrica.db.dao.impl;

import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.PlatformTransactionManager;

import com.secl.metrica.db.dao.SpringJdbcDao;

public class SpringJdbcDaoImpl extends JdbcDaoSupport implements SpringJdbcDao {

	PlatformTransactionManager transactionManager;

	public void saveObject(String sql, Object[] obj) throws Exception {
		try {
			// String sql =
			// "INSERT INTO CUSTOMER (CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
			// import java.sql.Types;
			// int[] types = new int[] { Types.VARCHAR, Types.VARCHAR,
			// Types.VARCHAR, Types.TIMESTAMP };
			getJdbcTemplate().update(sql, obj);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

    public int[] saveBatchUpate(String sql, BatchPreparedStatementSetter pss) throws Exception {
    	int[] arr = null;
    	try {
    		arr = getJdbcTemplate().batchUpdate(sql, pss);
        }
        catch(Exception e){
        	throw e;
        }
    	return arr;
    }

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Object getObject(String sql, Object[] params, Class clazz) throws Exception {
		try {
			// String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";
			return getJdbcTemplate().queryForObject(sql, params,
					new BeanPropertyRowMapper(clazz));
		} catch (EmptyResultDataAccessException er) {
			return null;
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List getObjectList(String sql, Object[] params, Class clazz) throws Exception {
		try {
			// String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";
			return getJdbcTemplate().query(sql, params,
					new BeanPropertyRowMapper(clazz));
		} catch (EmptyResultDataAccessException er) {
			return null;
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List getPrimitiveList(String sql, Object[] params, Class clazz) throws Exception {
		try {
			// String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";
			return getJdbcTemplate().queryForList(sql, params, clazz);
		} catch (EmptyResultDataAccessException er) {
			return null;
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	public void deleteObject(String sql, Object[] obj) throws Exception {
		try {
			getJdbcTemplate().update(sql, obj);
		} catch (EmptyResultDataAccessException er) {

		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	public void updateObject(String sql, Object[] obj) throws Exception {
		try {
			getJdbcTemplate().update(sql, obj);
		} catch (EmptyResultDataAccessException er) {

		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	@SuppressWarnings("deprecation")
	public long count(String sql, Object[] params) throws Exception {
		try {
			return getJdbcTemplate().queryForLong(sql, params);
		} catch (EmptyResultDataAccessException er) {
			return 0;
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	public void saveObjectList(List<String> sql, List<Object[]> obj) throws Exception {
		try {
			System.out.println(sql.size());
			System.out.println(getConnection().getAutoCommit());
			for (int i = 0; i < sql.size(); i++) {
				// PreparedStatement ps =
				// getConnection().prepareStatement(sql.get(i));
				// getJdbcTemplate().set
				getJdbcTemplate().update(sql.get(i), obj.get(i));
			}
			getConnection().commit();
		} catch (Exception e) {
			e.printStackTrace();
			getConnection().rollback();
			throw new Exception(e);
		}
	}

	public void executeSql(String sql) throws Exception {
		try {
			getJdbcTemplate().update(sql);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	@SuppressWarnings("deprecation")
	public int getRowCount(String sql) throws Exception {
		int total = 0;
		try {
			total = getJdbcTemplate().queryForInt(sql);
		} catch (Exception e) {
			throw new Exception(e);
		}
		return total;
	}

	@SuppressWarnings("deprecation")
	public long getMaxValue(String sql) throws Exception {
		long total = 0;
		try {
			total = getJdbcTemplate().queryForLong(sql);
		} catch (Exception e) {
			throw new Exception(e);
		}
		return total;
	}

	public PlatformTransactionManager getTransactionManager() {
		return transactionManager;
	}

	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}

}