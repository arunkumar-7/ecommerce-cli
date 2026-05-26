package com.stschool.ecommerce.service;

import com.stschool.ecommerce.exception.CustomerExistsException;
import com.stschool.ecommerce.model.Customer;

public class CustomerServiceImpl implements CustomerService {

    @Override
    public Customer save(Customer customer) throws CustomerExistsException {
    /*
    check if customer exists
    if exists throw exception
    if not exists then save customer
    */

        return null;
    }
}
