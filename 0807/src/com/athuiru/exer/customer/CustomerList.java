package com.athuiru.exer.customer;

public class CustomerList {
//    // 验证
//    public static void main(String[] args) {
//        CustomerList customerList = new CustomerList(10);
//        System.out.println(customerList.replaceCustomer(0, new Customer("haha", '男', 10, "999", "888@qq.com")));
//        customerList.addCustomer(new Customer("haha", '男', 10, "999", "888@qq.com"));
//        System.out.println(customerList.getCustomer(0).getEmail());
//        customerList.addCustomer(new Customer("kankan", '女', 20, "888", "999@qq.com"));
//        System.out.println(customerList.getTotal());
//        System.out.println(customerList.getAllCustomers()[1].getEmail());
//        customerList.replaceCustomer(1, new Customer("kankan2", '女', 20, "888", "999@qq.com"));
//        System.out.println(customerList.getCustomer(1).getName());
//        customerList.deleteCustomer(0);
//        System.out.println(customerList.getTotal());
//        System.out.println(customerList.getAllCustomers()[0].getName());
//    }

    private Customer[] customers;
    private int total;

    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    public boolean addCustomer(Customer customer) {
        if (total < customers.length) {
            customers[total] = customer;
            total++;
            return true;
        } else {
            return false;
        }
    }

    public boolean replaceCustomer(int index, Customer cust) {
        if (index >= 0 && index < total) {
            customers[index] = cust;
            return true;
        }
        return false;
    }

    public boolean deleteCustomer(int index) {
        if (index < 0 || index >= total) {
            return false;
        }

        for (int i = index; i < total - 1; i++) {
            customers[i] = customers[i + 1];
        }
        customers[--total] = null;
        return true;
    }

    public Customer[] getAllCustomers() {
        Customer[] totalCustomers = new Customer[total];
        for (int i = 0; i < total; i++) {
            totalCustomers[i] = customers[i];
        }
        return totalCustomers;
    }

    public Customer getCustomer(int index) {
        if (index < 0 || index >= total) {
            return null;
        }
        return customers[index];
    }

    public int getTotal() {
        return total;
    }
}
