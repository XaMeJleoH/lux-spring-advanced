package com.luxoft.data.examples.controllers;

import com.luxoft.data.examples.controllers.assemblers.AddressModelAssembler;
import com.luxoft.data.examples.controllers.assemblers.PersonModelAssembler;
import com.luxoft.data.examples.exceptions.PersonNotFoundException;
import com.luxoft.data.examples.model.Address;
import com.luxoft.data.examples.model.Person;
import com.luxoft.data.examples.repositories.AddressRepository;
import com.luxoft.data.examples.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/address")
public class HateoasAddressController {

    @Autowired
    private AddressModelAssembler addressModelAssembler;

    @Autowired
    private AddressRepository addressRepository;

    @GetMapping("/{id}")
    public EntityModel<Address> findAddressByPersonId(@PathVariable Long id) {

        Address address = addressRepository.findById(id)
                .orElseThrow(() -> new PersonNotFoundException(id));

        return addressModelAssembler.toModel(address);
    }

    @ExceptionHandler
    public ResponseEntity<String> handleExceptions(PersonNotFoundException e)
    {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(e.getMessage());
    }

}
