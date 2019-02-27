package CH9Inheritance;

public class SecretaryV3 extends EmployeeV3{
    public SecretaryV3(String name, int experience){
        super(name, experience);
    }
    public void dictation(String text){
        System.out.println("Taking dictation of "+text);

    }

}
