/**
 * Created By: Shikha Agarwal
 * Project Name: Class And Object
 * Package Name: PACKAGE_NAME
 * Date: 13-06-2021
 */
public class BankAccount {
    private int acNo;
    private double balance;
    private String customerName;
    private String email;
    private long phoneNo;

    public BankAccount() {
        this.acNo = 12345;
        this.balance = 0.0;
        this.customerName = "Shikha Agarwal";
        this.email = "xjshhu@gmail.com";
        this.phoneNo = 123456789;

    }

    public int getAcNo() {
        return acNo;
    }

    public void setAcNo(int acNo) {
        this.acNo = acNo;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void depositFund(int money) {
        this.balance += money;
        System.out.println("Deposited ammount: " + money + " . The new account balance : " + balance);
    }

    private void withdrawAmount(int amount) {
        if(this.balance < amount) {
            System.out.println("Transaction incomplete. Your account balance : " + balance);
        } else {
            this.balance -= amount;
            System.out.println("Amount withdrawn : " + amount + " . The new balance is : " + balance);
        }
    }
}

