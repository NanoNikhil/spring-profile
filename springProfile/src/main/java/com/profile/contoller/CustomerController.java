package com.profile.contoller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.profile.dto.CustomerDto;
import com.profile.entity.Customer;
import com.profile.service.CustomerService;
@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @PostMapping
    public List<Customer> saveCustomers(@RequestBody List<Customer> customers) {
        return service.addNewCustomers(customers);
    }

    @GetMapping
    public List<CustomerDto> fetchAllCustomers() {
        return service.getCustomers();
    }
}