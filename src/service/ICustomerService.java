package service;

import entities.Customer;
import java.util.*;

public interface ICustomerService {
    void addCustomer(Customer c);

    Customer findCustomerByMobile(String mobile);

    Set<Customer> allCustomers();

}
