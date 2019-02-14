package CH9Inheritance;
//This program is pretty cool
//arrays
public class LawFirm3 {
    public static void main(String[] args){
        EmployeeV3[] employees= {new LegalSecretaryV3("Tom"), new MarketerV3("Jonny"), new LawyerV3("Henry")};
        printInfo(employees);

    }
    public static void printInfo(EmployeeV3[] e){
        for(EmployeeV3 staff:e){
            System.out.println("Salary: $" + staff.salary());
            System.out.println("Vacation days: " + staff.getVacationDays());
            System.out.println("Vacation slip: " + staff.getLeaveSlip()+"\n");
        }
    }
}
