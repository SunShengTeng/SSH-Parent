package cn.sst.ssh.service;

import cn.sst.ssh.entity.Customer;

public interface CustomerService {

	
	/**
	 * 根据ID获取用户信息
	 * @param id
	 * @return
	 */
	public Customer findById(Long id);
}
