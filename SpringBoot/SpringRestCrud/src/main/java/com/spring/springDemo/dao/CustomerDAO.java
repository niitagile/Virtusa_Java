package com.spring.springDemo.dao;
import java.util.List;

import com.spring.springDemo.entity.*;
public interface CustomerDAO {
public List<Customer> getCustomers();
public void saveCustomer(Customer theCustomer);
public Customer getCustomer(int theId);
public void deleteCustomer(int theId);

}
