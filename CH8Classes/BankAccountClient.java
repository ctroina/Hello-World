package CH8Classes;

public class BankAccountClient {
    public static void main(String[] args){
        int[] address={6, 3,2002};
        BankAccountV1 chris=new BankAccountV1(address,"Christopher Troina", "123456789",
                "321 Street Av, Mamaroneck, NY, 10543", "0000", 6);
        System.out.println(chris);
        chris.withdraw(.02);
        System.out.println(chris);
        //public BankAccountV1(int[] dob, String name, String ssn, String address, int pin, double addBalance)
    }
}

