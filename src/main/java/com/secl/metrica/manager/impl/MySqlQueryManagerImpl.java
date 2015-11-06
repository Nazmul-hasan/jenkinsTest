package com.secl.metrica.manager.impl;

import com.secl.metrica.manager.QueryManager;
import com.secl.metrica.utils.Table;

public class MySqlQueryManagerImpl implements QueryManager {


	@Override
	public String getEmployees() {
		
		//String sql = "Select * From "+Table.EMPLOYEE+" Order by name";
		String sql = "select e.*,d.name as designationName from "+Table.EMPLOYEE+" e, "+Table.DESIGNATION+" d where e.designationID = d.oid order by e.name";
		return sql;
	}
	@Override
	public String getLoggedinUserinfo() {
		
		String sql = "select l.loginid,l.password,l.status,r.roledescription as roleDescription, r.menujson as menuJSON," +
				" e.employeeid as employeeID,e.name as employeeName,e.imagepath as photoPath" +
				" from "+Table.LOGIN+" l, "+Table.ROLE+" r, "+Table.EMPLOYEE+" e " +
				" where l.roleid = r.roleid" +
				" and l.employeeid = e.employeeid" +
				" and loginid = ?";
		
		return sql;
	}
	
	@Override
	public String getBranchList() {
		String sql = "SELECT * FROM "+Table.BRANCH +" ";
		return sql;
	}
	@Override
	public String getBranchByID() {
		String sql = "select * from " + Table.BRANCH + " Where branchid = ?";
		return sql;
	}
	
}





