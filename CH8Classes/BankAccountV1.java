package CH8Classes;
//this program is a very real bank account
public class BankAccountV1 {
    private double balance;
    private int pin;
    private String name;
    private String ssn;
    private String address;
    private int[] dob;
    public BankAccountV1(int[] dob, String name, String ssn, String address){
        this.dob=dob;
        this.name=name;
        this.ssn=ssn;
        this.address=address;
    }
    public BankAccountV1(int[] dob, String name, String ssn, String address, int pin, double addBalance){
        this.dob=dob;
        this.name=name;
        this.ssn=ssn;
        this.address=address;
        this.pin=pin;
        balance+=addBalance;
    }
    public double checkBalance(){
        return balance;
    }
    public int[] getDob(){
        return dob;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void withdraw(double amount){
        if(amount>balance)
            System.out.println("Withdrawal amount more than balance, choose lower value.");
        else {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ".");
        }
    }
    public void deposit(double cash){
        balance+=cash;
        System.out.println("Deposited $"+cash+".");
    }

}
