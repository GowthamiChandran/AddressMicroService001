package com.example.microaddress.service;

//import com.address.demo.dto.AddressDto;
//import com.address.demo.mapper.AddressMapper;
//import com.address.demo.model.Address;
//import com.address.demo.repository.AddressDao;
//import org.modelmapper.ModelMapper;
import com.example.microaddress.dto.AddressDto;
import com.example.microaddress.mapper.AddressMapper;
import com.example.microaddress.model.Address;
import com.example.microaddress.repo.AddressDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {


    private AddressDao addressDao;

    public AddressService(AddressDao addressDao){
        this.addressDao= addressDao;
    }

//    @Autowired
//    private ModelMapper modelMapper;


    public AddressDto createAddressOfEmployee(AddressDto addressDto){
     Address address= AddressMapper.mapToAddress(addressDto);
     Address savedAddress= addressDao.save(address);
     return AddressMapper.mapToAddressDto(savedAddress);
    }


    public AddressDto getEmployeeById(Long empId) {
        Address address=addressDao.findById(empId).orElse(null);

        return AddressMapper.mapToAddressDto(address);
    }
}

