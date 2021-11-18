public class BankAccount{
    private String accountNumber;
    private double balance;
    private String bankName;
    
    public void withdraw(double amount){
        if (this.balance<amount){
            System.out.println("Not enough money.");
        } else {
            if (amount>500.00){
                System.out.println("It is not allowed to withdraw more than 500 PLN at one time.");
            } else {
                this.balance-=amount;
            }
        }
    }
    public void deposit(double amount){
        this.balance+=amount;
    }
    public void displayBalance(){
        System.out.println(balance);
    }
    public void displayInfo(){
        System.out.println("Bank: "+bankName);
        System.out.println("Account number: "+accountNumber);
        System.out.println("Balance: "+balance+" PLN");
    }
    public BankAccount(String accountNumber, double balance, String bankName){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.bankName=bankName;
    }
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("23 6573 8274 8274 8274 8224 3424", 0.00, "PKO Bank Polski");
        bankAccount1.deposit(500.00);
        bankAccount1.displayBalance();
        bankAccount1.deposit(200.00);
        bankAccount1.displayBalance();
        bankAccount1.withdraw(300.00);
        bankAccount1.displayBalance();
        bankAccount1.withdraw(450.00);
        bankAccount1.displayBalance();
        bankAccount1.deposit(200.00);
        bankAccount1.displayBalance();
        bankAccount1.withdraw(600.00);
        bankAccount1.displayBalance();
    }
}
