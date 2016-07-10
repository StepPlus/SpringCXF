/**
 * 
 */
package com.stepplus.spring.cxf.customer.service.impl;

import org.springframework.stereotype.Service;

import com.stepplus.spring.cxf.customer.service.CustomerService;

/**
 * @author Uru
 *
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	/* (non-Javadoc)
	 * @see com.stepplus.spring.cxf.customer.service.CustomerService#getCustomerNameById(int)
	 */
	@Override
	public String getCustomerNameById(int id) {
		
		return "Step Plus" + id;
	}

}
