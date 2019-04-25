package org.academiadecodigo.tropadelete.foxtrot.dao;

import org.academiadecodigo.tropadelete.foxtrot.model.Customer;

public interface CustomerDao extends Dao<Customer> {

    Customer findByUsername(String username);
}
