package CH9Inheritance;
//This program is pretty cool
public class LawFirm {
    public static void main(String[] args){
        EmployeeV1 tom=new LegalSecretaryV2();
        EmployeeV1 jonny=new MarketerV2();
        EmployeeV1 henry=new LawyerV2();
        printInfo(tom);
        printInfo(jonny);
        printInfo(henry);
    }
    public static void printInfo(EmployeeV1 e){
        System.out.println("Salary: $"+e.salary());
        System.out.println("Vacation days: "+e.getVacationDays());
        System.out.println("Vacation slip: "+e.getLeaveSlip());
    }
}
