package com.danimeko.springmvc.service;

import com.danimeko.springmvc.domain.Customer;
import com.danimeko.springmvc.respositories.CustomerRespository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRespository customerRespository;

    public CustomerServiceImpl(CustomerRespository customerRespository){
        this.customerRespository = customerRespository;
    }

    @Override
    public Optional<Customer> findCustomerById(Long id) {

        return customerRespository.findById(id);
    }

    @Override
    public List<Customer> findAllCustomers() {

        return customerRespository.findAll();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRespository.save(customer);
    }
}
