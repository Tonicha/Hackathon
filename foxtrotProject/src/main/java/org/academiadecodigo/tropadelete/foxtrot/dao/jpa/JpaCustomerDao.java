package org.academiadecodigo.tropadelete.foxtrot.dao.jpa;


import org.academiadecodigo.tropadelete.foxtrot.dao.CustomerDao;
import org.academiadecodigo.tropadelete.foxtrot.model.Customer;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@Component
public class JpaCustomerDao extends AbstractDao<Customer> implements CustomerDao {

    public JpaCustomerDao() {
        super(Customer.class);
    }

    @Override
    public Customer findByUsername(String username) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Customer> criteriaQuery = builder.createQuery(Customer.class);
        Root root = criteriaQuery.from(Customer.class);
        criteriaQuery.select(root);
        criteriaQuery.where(builder.equal(root.get("USERNAME"), username));
        return em.createQuery(criteriaQuery).getSingleResult();
    }
}
