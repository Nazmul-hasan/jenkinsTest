package com.secl.metrica.manager.impl;

import com.secl.metrica.manager.QueryManager;
import com.secl.metrica.utils.Table;

public class PostgreSQLQueryManagerImpl implements QueryManager {

	@Override
	public String getEmployees() {
		
		String sql = "select *, " +
				" (select name from wing where  oid = wingID) as wingName," +
				" (select name from unit where  oid = unitID) as unitName," +
				" (select name from team where  oid = teamID) as teamName," +
				" (select name from tier where  oid = tierID) as tierName," +
				" (select gradesequence from grade where  oid = gradeID) as grade," +
				" (select gradeposition from grade where  oid = gradeID) as gradePosition," +
				" (select name from designation where  oid = designationID) as designationName" +
				" from "+Table.EMPLOYEE+
				" order by tiername,name";
		return sql;
	}
	
	
	
	@Override
	public String getLoggedinUserinfo() {
		
		/*String sql = "select l.loginid,l.password,l.status,r.roledescription as roleDescription, r.menujson as menuJSON," +
				" e.employeeid as employeeID,e.name as employeeName,e.imagepath as photoPath" +
				" from "+Table.LOGIN+" l, "+Table.ROLE+" r, "+Table.EMPLOYEE+" e " +
				" where l.roleid = r.roleid" +
				" and l.employeeid = e.employeeid" +
				" and loginid = ?";*/
		
		String sql = "select l.loginid,l.password,l.roleid,l.shiftid,l.sectionid,l.usertype,l.imagepath," +
		"l.name,l.email,l.phoneno,l.rolejson,r.roledescription,r.menujson "+
		" from "+Table.LOGIN+" l, "+Table.ROLE+" r " +
		" where l.roleid = r.roleid" +
		" and loginid = ?";
		
		return sql;
	}
    

	@Override
	public String getBranchList() {
		String sql = "SELECT * FROM "+Table.BRANCH +" ";
		return sql;
	}

	@Override
	public String getBranchByID() 
	{
		String sql = "select * from " + Table.BRANCH + " Where branchid = ?";
		return sql;
	}

}





