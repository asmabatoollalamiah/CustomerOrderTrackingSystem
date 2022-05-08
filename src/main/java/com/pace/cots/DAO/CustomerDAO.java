package com.pace.cots.DAO;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pace.cots.VO.Customer;
import com.pace.cots.VO.Order;

@Repository
public class CustomerDAO {
	
	@Value("classpath:files/Customers.json")
	Resource resourceFile;
	
	
	

	public List<Customer> getCustomers() {
		List<Customer> listofCustomers = new ArrayList<>();
		
		try {
			final ObjectMapper objectMapper = new ObjectMapper();
			InputStream inputStream = resourceFile.getInputStream();
			listofCustomers = objectMapper.readValue(inputStream, new TypeReference<List<Customer>>(){});
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listofCustomers;
	  }
	
	public Customer getCustomersById(String customerId) {
		List<Customer> listofCustomers = new ArrayList<>();
		Customer customer = new Customer();
		try {
			final ObjectMapper objectMapper = new ObjectMapper();
			InputStream inputStream = resourceFile.getInputStream();
			listofCustomers = objectMapper.readValue(inputStream, new TypeReference<List<Customer>>(){});
			customer = listofCustomers.stream().filter(cust -> cust.getCustomerId() == Integer.parseInt(customerId)).findFirst().orElse(new Customer());
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customer;
	}
	
	public List<Order> getCustomerOrders(String customerId) {
		List<Customer> listofCustomers = new ArrayList<>();
		List<Order> listofOrders = new ArrayList<>();
		Customer customer = new Customer();
		
		try {
			final ObjectMapper objectMapper = new ObjectMapper();
			InputStream inputStream = resourceFile.getInputStream();
			listofCustomers = objectMapper.readValue(inputStream, new TypeReference<List<Customer>>(){});
			customer = listofCustomers.stream().filter(cust -> cust.getCustomerId() == Integer.parseInt(customerId)).findFirst().orElse(new Customer());
			listofOrders = customer.getOrdersList();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listofOrders;
	
	}
	
	public Order getCustomerOrderById(String customerId, String orderId) {
		List<Customer> listofCustomers = new ArrayList<>();
		List<Order> listofOrders = new ArrayList<>();
		Customer customer = new Customer();
		Order order = new Order();
		try {
			final ObjectMapper objectMapper = new ObjectMapper();
			InputStream inputStream = resourceFile.getInputStream();
			listofCustomers = objectMapper.readValue(inputStream, new TypeReference<List<Customer>>(){});
			customer = listofCustomers.stream().filter(cust -> cust.getCustomerId() == Integer.parseInt(customerId)).findFirst().orElse(new Customer());
			listofOrders = customer.getOrdersList();
			order = listofOrders.stream().filter(ord -> ord.getOrderId() == Integer.parseInt(orderId)).findFirst().orElse(new Order());
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return order;
	}
}
