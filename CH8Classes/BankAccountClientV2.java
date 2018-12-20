package CH8Classes;

public class BankAccountClientV2 {
    public static void main(String[] args){
        BankAccountV2 chris=new BankAccountV2(new DateOfBirth(6, 3, 2002),"Christopher Troina",
                "123456789", new Address(111,"Street Rd","Mamaroneck","NY",10545,
                "America"), "0000", 6);
        System.out.println(chris);
        chris.withdraw(.02);
        System.out.println(chris);
        //public BankAccountV1(int[] dob, String name, String ssn, String address, int pin, double addBalance)
    }
}

