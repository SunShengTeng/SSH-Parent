package cn.sst.ssh.service.impl;

import cn.sst.ssh.dao.CustomerDao;
import cn.sst.ssh.entity.Customer;
import cn.sst.ssh.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {


	
	private CustomerDao customerDao;
	


	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}



	@Override
	public Customer findById(Long id) {
		
		return customerDao.findById(id);
	}

}
