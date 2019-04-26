package org.academiadecodigo.tropadelete.foxtrot.dto.assembler;

import org.academiadecodigo.tropadelete.foxtrot.dto.CustomerDto;
import org.academiadecodigo.tropadelete.foxtrot.model.Customer;
import org.academiadecodigo.tropadelete.foxtrot.service.CustomerService;

public class CustomerToDtoAssembler {
    private CustomerService customerService;

    public CustomerDto convert(Customer customer) {

        CustomerDto customerDto = new CustomerDto();
        customerDto.setId(customer.getId());
        customerDto.setUsername(customer.getUserName());
        customerDto.setEmail(customer.getEmail());
        customerDto.setPassword(customer.getPassword());
        return customerDto;
    }

}
