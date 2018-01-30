package cn.sst.ssh.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.sst.ssh.entity.Customer;
import cn.sst.ssh.service.CustomerService;

public class findUserAction extends ActionSupport {
    public Long userId;
    private Customer customer;
    private CustomerService customerService;
    
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public CustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
    
	
	public String findUserInfo(){
	    customer = customerService.findById(userId);
		System.out.println("后台返回的用户信息："+userId);
		return SUCCESS;
	}
	
}
