package com.danimeko.springmvc.respositories;

import com.danimeko.springmvc.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRespository extends JpaRepository<Customer , Long> {

}
