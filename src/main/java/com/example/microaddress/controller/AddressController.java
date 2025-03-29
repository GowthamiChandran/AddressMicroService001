package com.example.microaddress.controller;

//import com.address.demo.Service.AddressService;
//import com.address.demo.dto.AddressDto;
import com.example.microaddress.dto.AddressDto;
import com.example.microaddress.service.AddressService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/address")
public class AddressController {

    public AddressController(AddressService addressService){
        this.addressService=addressService;
    }
    private AddressService addressService;

    @PostMapping
    public ResponseEntity<AddressDto> createEmployee(@RequestBody AddressDto addressDto){
        AddressDto savedAddressDto = addressService.createAddressOfEmployee(addressDto);
        return new ResponseEntity<>(savedAddressDto, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AddressDto> getEmployeeById(@PathVariable("id") Long empId)  {
        AddressDto addressDto= addressService.getEmployeeById(empId);
        return ResponseEntity.ok(addressDto);
    }




}
