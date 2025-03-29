package com.example.microaddress.mapper;

//import com.address.demo.dto.AddressDto;
//import com.address.demo.model.Address;

import com.example.microaddress.dto.AddressDto;
import com.example.microaddress.model.Address;

public class AddressMapper {

    public static AddressDto mapToAddressDto(Address address){
        AddressDto addressDto = new AddressDto();
        addressDto.setLane1(address.getLane1());
        addressDto.setLane2(address.getLane2());
        addressDto.setZip(address.getZip());
        addressDto.setState(address.getState());
        return  addressDto;
    }

    public  static Address mapToAddress(AddressDto addressDto){
        Address address = new Address();
        address.setLane1(addressDto.getLane1());
        address.setLane2(addressDto.getLane2());
        address.setState(addressDto.getState());
        address.setZip(addressDto.getZip());
        return address;
    }
}
