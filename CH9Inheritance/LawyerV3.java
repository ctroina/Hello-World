package CH9Inheritance;

public class LawyerV3 extends EmployeeV3{
    //Inherit methods from the EmployeeV1 class
    public LawyerV3(String name, int experience){
        super(name, experience);
    }
    //override methods from EmployeeV1 class
    public int getVacationDays(){
        return super.getVacationDays()+5;
    }
    public String getLeaveSlip(){
        return "pink";
    }
    public void sue(){
        System.out.println("I'll see you in court.");
    }

}
