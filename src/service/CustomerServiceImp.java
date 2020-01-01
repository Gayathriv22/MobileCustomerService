package service;

import dao.ICustomerDao;
import entities.Customer;
import exceptions.MobileNumberNotFoundException;

import java.util.*;

public class CustomerServiceImp implements ICustomerService {
    private ICustomerDao dao;

    public CustomerServiceImp(ICustomerDao dao) {
        this.dao = dao;
    }

    @Override
    public void addCustomer(Customer c) {
        dao.addCustomer(c);
    }

    @Override
    public Customer findCustomerByMobile(String mobile) {
    // dao.findCustomerByMobile(mobile);
     Customer c=dao.findCustomerByMobile(mobile);
     return c;
    }

    @Override
    public Set<Customer> allCustomers() {
        Set<Customer>customers=dao.allCustomers();
        return customers;
    }
}
