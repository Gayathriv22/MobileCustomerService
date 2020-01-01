package ui;

import dao.CustomerDaoImp;
import entities.Customer;
import service.CustomerServiceImp;
import service.ICustomerService;

import java.util.*;

public class CustomerUi {
    private ICustomerService service = new CustomerServiceImp(new CustomerDaoImp());


    public static void main(String[] args) {
        CustomerUi ui = new CustomerUi();
        ui.runUi();
    }

    public void runUi() {

        Customer c1 = new Customer("9895426744", "Mariam",9000);
        Customer c2 = new Customer("9999786123", "gv",8000);
        service.addCustomer(c1);
        service.addCustomer(c2);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("CUSTOMER MOBILE CARE ");
        System.out.println("********************");
        System.out.println();
        System.out.println("Enter the mobile number: ");
        String ch;
        ch = sc.next();
        //service.findCustomerByMobile(ch);
       Customer fetched1=service.findCustomerByMobile(ch);

       System.out.println("Welcome "+fetched1.getName()+" ! ");
       System.out.println("Your balance is :"+fetched1.getBalance());
    }
}