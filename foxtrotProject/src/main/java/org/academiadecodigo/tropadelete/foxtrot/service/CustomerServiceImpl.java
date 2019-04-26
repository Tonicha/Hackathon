package org.academiadecodigo.tropadelete.foxtrot.service;

import org.academiadecodigo.tropadelete.foxtrot.dao.CustomerDao;
import org.academiadecodigo.tropadelete.foxtrot.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerServiceImpl  implements CustomerService{

    private CustomerDao customerDao;

    @Autowired
    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Transactional
    public Customer addCustomer(Customer customer) {
        return customerDao.saveOrUpdate(customer);
    }


    public Customer editCustomer(Integer id){
        return customerDao.findById(id);
    }

    @Override
    public Customer get(Integer id) {
        return customerDao.findById(id);
    }

    @Override
    public Customer getByUsername(String username) {
        return customerDao.findByUsername(username);
    }

}
