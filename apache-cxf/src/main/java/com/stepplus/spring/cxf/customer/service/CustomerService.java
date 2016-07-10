/**
 * 
 */
package com.stepplus.spring.cxf.customer.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * @author Uru
 *
 */
@Path("/customer")
public interface CustomerService {

	@GET
	@Path("/{id}")
	@Produces("text/plain")
	public String getCustomerNameById(@PathParam("id") int id);
}
