package cn.sst.ssh.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.sst.ssh.dao.CustomerDao;
import cn.sst.ssh.entity.Customer;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	@Override
	public Customer findById(Long id) {
		
		return this.getHibernateTemplate().get(Customer.class, id);
	}

}
