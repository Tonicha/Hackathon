package org.academiadecodigo.tropadelete.foxtrot.service;

import org.academiadecodigo.tropadelete.foxtrot.model.Customer;

public interface CustomerService {

    Customer addCustomer(Customer customer);

    Customer editCustomer(Integer id);

    Customer get(Integer id);

    Customer getByUsername(String username);
}
