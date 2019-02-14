package CH9Inheritance;
//This program is pretty cool
//arrays
public class LawFirm2 {
    public static void main(String[] args){
        EmployeeV1[] employees= new EmployeeV1[3];
        employees[0]=new LegalSecretaryV2();
        employees[1]=new MarketerV2();
        employees[2]=new LawyerV2();
        printInfo(employees);

    }
    public static void printInfo(EmployeeV1[] e){
        for(int i=0;i<e.length;i++) {
            System.out.println("Salary: $" + e[i].salary());
            System.out.println("Vacation days: " + e[i].getVacationDays());
            System.out.println("Vacation slip: " + e[i].getLeaveSlip()+"\n");

        }
    }
}
