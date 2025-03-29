package com.example.microaddress.repo;

import com.example.microaddress.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AddressDao extends JpaRepository<Address,Long> {

}
