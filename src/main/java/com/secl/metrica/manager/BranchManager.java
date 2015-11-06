package com.secl.metrica.manager;

import javax.servlet.http.HttpServletRequest;

import com.secl.metrica.bean.BranchBean;
import com.secl.metrica.bean.ResponseBean;

public interface BranchManager {

	ResponseBean getAllBranches (BranchBean model);

	ResponseBean SaveBranch(HttpServletRequest request, ResponseBean resBean,
			BranchBean model);

	ResponseBean getBranchByID(BranchBean model);

	
}
