package com.profile.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.profile.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}