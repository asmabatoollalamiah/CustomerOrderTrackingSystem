package com.pace.cots.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pace.cots.VO.Customer;
import com.pace.cots.VO.Order;
import com.pace.cots.service.CustomerService;

@RestController("/")
public class CustomerController {
	
	@Autowired CustomerService customerSevice;
	
	@GetMapping("/customers")
	@ResponseBody
	  public List<Customer> getCustomers(HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods", "GET");
		response.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization");
	    return customerSevice.getCustomers();
	  }
	 
	 @GetMapping("/customers/{id}")
	  public Customer getCustomersById(@PathVariable("id") String customerId, HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods", "GET");
		response.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization");
	    return customerSevice.getCustomersById(customerId);
	  }
	 
	 @GetMapping("/customers/{id}/orders")
	  public List<Order> getCustomerOrders(@PathVariable("id") String customerId, HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods", "GET");
		response.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization");
	    return customerSevice.getCustomerOrders(customerId);
	  }
	 
	 @GetMapping("/customers/{cusId}/orders/{ordId}")
	  public Order getCustomerOrderById(@PathVariable("cusId") String customerId,@PathVariable("ordId") String orderId, HttpServletResponse response) {
		 response.setHeader("Access-Control-Allow-Origin", "*");
		 response.setHeader("Access-Control-Allow-Methods", "GET");
		 response.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization");
		 return customerSevice.getCustomerOrderById(customerId, orderId);
	  }

}
