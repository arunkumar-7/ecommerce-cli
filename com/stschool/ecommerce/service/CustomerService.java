package com.stschool.ecommerce.service;

import com.stschool.ecommerce.exception.CustomerExistsException;
import com.stschool.ecommerce.model.Customer;

public interface CustomerService {
    Customer save(Customer customer) throws CustomerExistsException;
}
