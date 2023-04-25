package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.CustomerDetails;
import com.example.demo.Repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository repository;
	
	public String addCustomer(CustomerDetails customer)
	{
		repository.save(customer);
		return "Added";
	}
	public List<CustomerDetails> getCustomer()
	{
		return repository.findAll();
	}
	public Optional<CustomerDetails> getCustomerById(int id)
	{
		return repository.findById(id);
	}
	public String updateCustomer(CustomerDetails customer)
	{
		repository.save(customer);
		return "Updated";
	}
	public void deleteByRequestParam(int id)
	{
		repository.deleteById(id);
	}

}
