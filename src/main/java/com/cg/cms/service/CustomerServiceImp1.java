package com.cg.cms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.cms.entities.Customer;
import com.cg.cms.repository.CustomerRepository;

@Service
public class CustomerServiceImp1 implements CustomerService{
    @Autowired
	private CustomerRepository repository;
	
    @Override
    public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		repository.save(customer);
	}

	@Override
	public List<Customer> fetchAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void delCustomer(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		repository.save(customer);
	}

	@Override
	public Customer fetchById(int id) {
		// TODO Auto-generated method stub
		Customer cust=null;
		Optional<Customer> optional=repository.findById(id);
		if(optional.isPresent())
		{
			cust=optional.get();
		}
		return cust;
	}

}
