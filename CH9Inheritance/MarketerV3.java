package CH9Inheritance;

public class MarketerV3 extends EmployeeV3{
    public MarketerV3(String name, int experience){
        super(name, experience);
    }
    public double salary(){
        return super.salary()+10000;
    }
    public void advertize(){
        System.out.println("Use our firm");
    }
}
