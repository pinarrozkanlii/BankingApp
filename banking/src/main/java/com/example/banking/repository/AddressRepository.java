package com.example.bankapp.repository;

import com.example.bankapp.model.Address;
import com.example.bankapp.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, String> {
}
