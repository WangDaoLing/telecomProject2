package com.telecom.project.changelogmag.operationServerService;


import java.util.List;

import com.telecom.project.beans.ChangeBean;

/**
 * 操作日志增业务接口
 * @author 
 *
 */
public interface IOperationChangeService {
	/**
	 * 新增操作日志
	 * @param server
	 */
	public void saveChangeBeanBean(ChangeBean change);
	
	
}
