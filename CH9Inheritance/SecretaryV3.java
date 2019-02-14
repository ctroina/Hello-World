package CH9Inheritance;

public class SecretaryV3 extends EmployeeV3{
    public SecretaryV3(String name){
        super(name);
    }
    public void dictation(String text){
        System.out.println("Taking dictation of "+text);
    }
}
