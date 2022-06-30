package chapterThree;

public class MyAccount {
    private boolean isEmpty;
    private String name;
    private  double balance;
    private double deposit;
    private double withdraw;
    private double transfer;


    public MyAccount() {
    }

    public boolean isEmpty() {
        return  isEmpty;
    }

    public void setName(String name) {
        this.name =name;
    }

    public String getName() {
        return name;
    }

    public void deposit(double amount) {
        balance +=amount;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        this.withdraw=amount;
        if(withdraw > balance ){
            System.out.println("Insufficient fund");
        }
        else if(withdraw<balance){
            balance = balance- amount;
        }
    }

    public void transfer(double amount) {
        this.transfer = amount;
        transfer = amount;

    }
}
