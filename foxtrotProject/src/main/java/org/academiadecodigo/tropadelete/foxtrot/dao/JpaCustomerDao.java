package org.academiadecodigo.tropadelete.foxtrot.dao;


import org.academiadecodigo.tropadelete.foxtrot.model.Customer;

public class JpaCustomerDao extends AbstractDao<Customer> implements CustomerDao {

    public JpaCustomerDao() {
        super(Customer.class);
    }
}
