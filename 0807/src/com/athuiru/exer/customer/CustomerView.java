package com.athuiru.exer.customer;

public class CustomerView {
    CustomerList customerList = new CustomerList(10);

    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }

    public void enterMainMenu() {

        boolean loopFlag = true;
        while (loopFlag) {
            System.out.print("             -----------------拼电商客户管理系统-----------------\n" +
                    "\n" +
                    "                                     1 添 加 客 户\n" +
                    "                                     2 修 改 客 户\n" +
                    "                                     3 删 除 客 户\n" +
                    "                                     4 客 户 列 表\n" +
                    "                                     5 退           出\n" +
                    "\n" +
                    "                                     请选择(1-5)：");
            char selection = CMUtility.readMenuSelection();

            switch (selection) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.print("确认是否退出(Y/N)：");
                    char isExit = CMUtility.readConfirmSelection();
                    if (isExit == 'Y') {
                        loopFlag = false;
                    }
                    break;
                default:
                    break;
            }
        }
    }

    private void addNewCustomer() {
        System.out.println("---------------------添加客户---------------------");
        System.out.print("姓名：");
        String name = CMUtility.readString(10);
        System.out.print("性别：");
        char gender = CMUtility.readChar();
        System.out.print("年龄：");
        int age = CMUtility.readInt();
        System.out.print("电话：");
        String tel = CMUtility.readString(100);
        System.out.print("邮箱：");
        String email = CMUtility.readString(100);

        Customer customer = new Customer(name, gender, age, tel, email);
        boolean flag = customerList.addCustomer(customer);
        if (flag) {
            System.out.println("---------------------添加完成---------------------");
        } else {
            System.out.println("---------------------记录已满，无法添加---------------------");
        }
    }

    // 键盘输入回车，跳过
    // -1退出未实现
    public void modifyCustomer() {
        System.out.println("---------------------修改客户---------------------");
        System.out.print("请选择待修改客户编号(-1退出)：");
        int num = CMUtility.readInt();
        if (num == -1) {
            return;
        }

        int index = num - 1;
        Customer oldCustomer = customerList.getCustomer(index);
        if (oldCustomer == null) {
            System.out.println("无法找到指定客户！");
        }
        System.out.print("姓名" + "(" + oldCustomer.getName() + ")：");
        String name = CMUtility.readString(10, oldCustomer.getName());
        if (name != null && !"".equals(name)) {
            oldCustomer.setName(name);
        }

        System.out.print("性别" + "(" + oldCustomer.getGender() + ")：");
        char gender = CMUtility.readChar(oldCustomer.getGender());
        oldCustomer.setGender(gender);

        System.out.print("年龄" + "(" + oldCustomer.getAge() + ")：");
        int age = CMUtility.readInt(oldCustomer.getAge());
        oldCustomer.setAge(age);

        System.out.print("电话" + "(" + oldCustomer.getPhone() + ")：");
        String tel = CMUtility.readString(100, oldCustomer.getPhone());
        if (tel != null && !"".equals(tel)) {
            oldCustomer.setPhone(tel);
        }

        System.out.print("邮箱" + "(" + oldCustomer.getEmail() + ")：");
        String email = CMUtility.readString(100, oldCustomer.getEmail());
        if (email != null && !"".equals(email)) {
            oldCustomer.setEmail(email);
        }

        System.out.println("---------------------修改完成---------------------");
    }

    // -1退出未实现
    private void deleteCustomer() {
        System.out.println("---------------------删除客户---------------------");
        System.out.print("请选择待删除客户编号(-1退出)：");
        int num = CMUtility.readInt();
        if (num == -1) {
            return;
        }

        int index = num - 1;
        System.out.print("确认是否删除(Y/N)：");
        char selection = CMUtility.readConfirmSelection();

        if ('N' == selection) {
            return;
        }
        boolean flag = customerList.deleteCustomer(index);
        if (flag) {
            System.out.println("---------------------删除完成---------------------");
        } else {
            System.out.println("--------------无法找到指定客户，删除失败-------------");
        }

    }

    public void listAllCustomers() {
        System.out.println("---------------------------客户列表---------------------------");
        Customer[] allCustomers = customerList.getAllCustomers();
        if (allCustomers.length == 0) {
            System.out.println("没有客户记录！");
        } else {
            System.out.println("编号\t姓名\t性别\t年龄\t电话\t邮箱");
            for (int i = 0; i < allCustomers.length; i++) {
                Customer customer = allCustomers[i];
                System.out.println(i + 1 + "\t" + customer.getName() + "\t" + customer.getGender()
                        + "\t" + customer.getAge() + "\t" + customer.getPhone() + "\t" + customer.getEmail());
            }
        }

        System.out.println("-------------------------客户列表完成-------------------------");
    }
}
