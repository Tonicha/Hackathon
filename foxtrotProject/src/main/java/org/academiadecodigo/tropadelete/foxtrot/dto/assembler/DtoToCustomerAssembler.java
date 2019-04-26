package org.academiadecodigo.tropadelete.foxtrot.dto.assembler;

import org.academiadecodigo.tropadelete.foxtrot.dto.CustomerDto;
import org.academiadecodigo.tropadelete.foxtrot.model.Customer;
import org.academiadecodigo.tropadelete.foxtrot.service.CustomerService;

public class DtoToCustomerAssembler {


    private CustomerService customerService;

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }


    public Customer convert(CustomerDto customerDto) {

        Customer customer = (customerDto.getId() != null ? customerService.get(customerDto.getId()) : new Customer());

        customer.setUserName(customerDto.getUsername());
        customer.setEmail(customerDto.getEmail());
        customer.setPassword(customerDto.getPassword());

        return customer;
    }
}
