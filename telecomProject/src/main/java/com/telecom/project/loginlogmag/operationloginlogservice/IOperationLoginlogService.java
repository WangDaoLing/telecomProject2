package com.telecom.project.loginlogmag.operationloginlogservice;

import com.telecom.project.beans.LoginLogBean;

public interface IOperationLoginlogService {
	/**
	 * 添加日志
	 * @param loginLog
	 */
	public void saveLoginLog(LoginLogBean loginLog);
}
