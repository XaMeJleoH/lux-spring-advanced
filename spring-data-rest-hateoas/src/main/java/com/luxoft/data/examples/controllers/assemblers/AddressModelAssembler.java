package com.luxoft.data.examples.controllers.assemblers;

import com.luxoft.data.examples.controllers.HateoasPersonController;
import com.luxoft.data.examples.model.Address;
import com.luxoft.data.examples.model.Person;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class AddressModelAssembler implements RepresentationModelAssembler<Address, EntityModel<Address>> {

    @Override
    public EntityModel<Address> toModel(Address address) {
        return EntityModel.of(address);
    }

    @Override
    public CollectionModel<EntityModel<Address>> toCollectionModel(Iterable<? extends Address> addresses) {

        return RepresentationModelAssembler.super.toCollectionModel(addresses);
    }
}
