package CH8Classes;
//this program is a very real bank account
public class BankAccountV2 {
    private double balance;
    private String pin;
    private String name;
    private String ssn;
    private Address address;
    private DateOfBirth dob;
    public BankAccountV2(DateOfBirth dob, String name, String ssn, Address address){
        this.dob=dob;
        this.name=name;
        this.ssn=ssn;
        this.address=address;
    }
    public BankAccountV2(DateOfBirth dob, String name, String ssn, Address address, String pin, double addBalance){
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
    public DateOfBirth getDob(){
        return dob;
    }
    public String getName(){
        return name;
    }
    public Address getAddress(){
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
    public String toString(){
        return "Name: "+name+"\n"+"Balance: "+balance;
    }
}
/*


 */