package Constructor;

import Constructor.BankAccount;

/**
 * Created By: Shikha Agarwal
 * Project Name: Class And Object
 * Package Name: PACKAGE_NAME
 * Date: 13-06-2021
 */
public class Main {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount();
        System.out.println(obj.getCustomerName());
        System.out.println(obj.getAcNo());
        obj.depositFund(1200);
        obj.withdrawAmount(500);
        obj.withdrawAmount(1200);
    }
}

