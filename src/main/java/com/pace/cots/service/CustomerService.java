package com.pace.cots.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.pace.cots.DAO.CustomerDAO;
import com.pace.cots.VO.Customer;
import com.pace.cots.VO.Order;

@Service
public class CustomerService {

	@Autowired CustomerDAO customerDAO;
	
	
	public List<Customer> getCustomers() {
	    return customerDAO.getCustomers();
	}
	public Customer getCustomersById(String customerId) {
		 return customerDAO.getCustomersById(customerId);
	}
	public List<Order> getCustomerOrders(String customerId) {
		 return customerDAO.getCustomerOrders(customerId);
	}
	public Order getCustomerOrderById(String customerId, String orderId) {
		return customerDAO.getCustomerOrderById(customerId, orderId);
	}
}
