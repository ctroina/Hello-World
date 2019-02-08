package CH9Inheritance;

public class LawyerV2 extends EmployeeV1{
    //Inherit methods from the EmployeeV1 class

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
