package CH9Inheritance;


//This is a class
public class EmployeeV3 {
    private String name;
    //this is not a class
    public EmployeeV3(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public int getHours(){
        return 40;
    }
    public double salary(){
        return 40000;
    }
    public int getVacationDays(){
        return 10;
    }
    public String getLeaveSlip(){
        return "yellow";
    }
}
