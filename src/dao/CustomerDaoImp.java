package dao;

import entities.Customer;
import exceptions.MobileNumberNotFoundException;

import java.util.*;

public class CustomerDaoImp implements ICustomerDao {
    private Map<String, Customer> store = new HashMap<>();

    @Override
    public void addCustomer(Customer c) {
        store.put(c.getMobile(), c);

    }

    @Override
    public Customer findCustomerByMobile(String mobile)  {
           if (store.get(mobile) == null) {
               throw new MobileNumberNotFoundException("mobile number is not found " + mobile);
           }
           Customer c = store.get(mobile);

           return c;
       }



    @Override
    public Set<Customer> allCustomers() {
        Collection<Customer> customers = store.values();
        Set<Customer> customerSet = new HashSet<>(customers);
        return customerSet;

    }

}
