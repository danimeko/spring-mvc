package com.danimeko.springmvc.controller;

import com.danimeko.springmvc.domain.Customer;
import com.danimeko.springmvc.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(CustomerController.BASE_URL)
public class CustomerController {

    public static final String BASE_URL ="/api/v1/customers";
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    List<Customer> getAllCustomer(){
        return customerService.findAllCustomers();
    }
    @GetMapping("/{id}")
    public Optional<Customer> getCustomerById(@PathVariable Long id){
        return customerService.findCustomerById(id);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer saveCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }

}
