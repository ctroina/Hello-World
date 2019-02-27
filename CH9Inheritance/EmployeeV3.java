package CH9Inheritance;


//This is a class
public class EmployeeV3 {
    private String name;
    private int experience;
    //this is not a class
    public EmployeeV3(String name, int experience){
        this.name=name;
        this.experience=experience;
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

    public int getExperience() {
        return experience;
    }

    public String getLeaveSlip(){
        return "yellow";
    }
}
