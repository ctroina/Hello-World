package CH9Inheritance;

public class MarketerV2 extends EmployeeV1{
    public double salary(){
        return super.salary()+10000;
    }
    public void advertize(){
        System.out.println("Use our firm");
    }
}
