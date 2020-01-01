package dao;
import entities.Customer;

import java.util.*;

public interface ICustomerDao {
    void addCustomer(Customer c);
    Customer findCustomerByMobile(String mobile);
    Set<Customer> allCustomers();
}
