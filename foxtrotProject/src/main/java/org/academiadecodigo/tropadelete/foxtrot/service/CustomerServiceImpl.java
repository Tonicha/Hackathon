package org.academiadecodigo.tropadelete.foxtrot.service;

import org.academiadecodigo.tropadelete.foxtrot.dao.CustomerDao;
import org.academiadecodigo.tropadelete.foxtrot.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl  implements CustomerService{

    private CustomerDao customerDao;

    @Autowired
    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public void addCustomer(){

        Customer customer = new Customer();
        customerDao.saveOrUpdate(customer);
    }


    public Customer editCustomer(Integer id){
        return customerDao.findById(id);
    }
}
