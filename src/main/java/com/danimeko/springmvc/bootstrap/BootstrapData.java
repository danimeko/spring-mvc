package com.danimeko.springmvc.bootstrap;

import com.danimeko.springmvc.domain.Customer;
import com.danimeko.springmvc.respositories.CustomerRespository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData  implements CommandLineRunner {

    private final CustomerRespository customerRespository;

    public BootstrapData(CustomerRespository customerRespository) {
        this.customerRespository = customerRespository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Load customer data....");

        Customer C1 = new Customer();
        C1.setFirstname("Daniel");
        C1.setLastname("Chala");
        customerRespository.save(C1);

        Customer C2 = new Customer();
        C2.setFirstname("Chuhu");
        C2.setLastname("Nana");
        customerRespository.save(C2);

        Customer C3 = new Customer();
        C3.setFirstname("Hayle");
        C3.setLastname("Bogale");
        customerRespository.save(C3);

        System.out.println("Customer  saved " + customerRespository.count());

    }
}
