package CH9Inheritance;

public class LegalSecretaryV2 extends SecretaryV2{
    public double salary(){
        return super.salary()+5000;
    }
}
