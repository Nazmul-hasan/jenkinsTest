package com.secl.metrica.manager.impl;

import java.util.Random;

import org.apache.log4j.Logger;

import com.secl.metrica.bean.DashboardBean;
import com.secl.metrica.manager.DashboardManager;
import com.secl.metrica.utils.Constant;


public class DashboardImpl extends ManagerImpl implements Constant, DashboardManager {
	
	@SuppressWarnings("unused")
	private String viewGroup;
	@SuppressWarnings("unused")
	private String viewName;
	private final int MIN = 10;
	private final int MAX = 500;
	@SuppressWarnings("unused")
	private Logger _logger = Logger.getLogger(DashboardImpl.class);
	

	
	
	@Override
	public DashboardBean getData() {
		
		
		DashboardBean dashboardBean = new DashboardBean();
		//dashboardBean.setConnect(randInt(MIN, MAX));
		//dashboardBean.setInit(randInt(MIN, MAX));
		//dashboardBean.setDisconnect(randInt(MIN, MAX));
		//dashboardBean.setKill(randInt(MIN, MAX));
		
		
		/*CouchbaseClient client;
		
		try {
			
			client = ConnectionManager.getInstance();
			View view = client.getView(viewGroup, viewName);
			Query query = new Query();
			query.setIncludeDocs(true).setStale(Stale.FALSE).setGroup(true);
			ViewResponse result = client.query(view, query);
			
			for(ViewRow row : result) {
				if(row.getKey().equalsIgnoreCase(ACTION_CONNECT)) {
					dashboardBean.setConnect(Integer.parseInt(row.getValue()));
				}
				else if(row.getKey().equalsIgnoreCase(ACTION_INITCALL)) {
					dashboardBean.setInit(Integer.parseInt(row.getValue()));
				}
				else if(row.getKey().equalsIgnoreCase(ACTION_KILLCALL)) {
					dashboardBean.setKill(Integer.parseInt(row.getValue()));
				}
				else if(row.getKey().equalsIgnoreCase(ACTION_DISCONNECT)) {
					dashboardBean.setDisconnect(Integer.parseInt(row.getValue()));
				}
			}
			
		} catch (Exception e) {
			//e.printStackTrace();
		}*/
		
		return dashboardBean;
	}

	
	private int randInt(int min, int max) {
	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
	
	
	// Setter
	public void setViewGroup(String viewGroup) {
		this.viewGroup = viewGroup;
	}

	public void setViewName(String viewName) {
		this.viewName = viewName;
	}



}




