package assignments.module3.BasicMethodsandoop;

class BankAccount {
    int accountNumber;
    double balance;
    void deposit(double amt){
        balance += amt;
    }
    void withdraw(double amt){
        balance -= amt;
    }
    void display(){
        System.out.println(balance);
    }
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.deposit(1000);
        b.withdraw(200);
        b.display();
    }
}

