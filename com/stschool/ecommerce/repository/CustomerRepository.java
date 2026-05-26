package com.stschool.ecommerce.repository;

import com.stschool.ecommerce.model.Customer;
import com.stschool.ecommerce.util.CsvReader;

import java.util.List;

public class CustomerRepository {

    private List<Customer> customers;

    private CsvReader csvReader;

    public CustomerRepository(CsvReader csvReader) {
        this.csvReader = csvReader;
    }

    public List<Customer> getCustomers() {
        this.customers = CsvReader.getCustomersFromCsv();
        return customers;
    }
}
