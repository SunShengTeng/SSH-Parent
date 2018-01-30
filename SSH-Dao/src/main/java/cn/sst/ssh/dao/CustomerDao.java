package cn.sst.ssh.dao;

import cn.sst.ssh.entity.Customer;

public interface CustomerDao {
	

   /**
    * 根据ID获取用户信息。
 * @param id
 * @return
 */
public Customer findById(Long id);
}
