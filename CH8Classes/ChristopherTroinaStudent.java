package CH8Classes;

import java.util.Arrays;

public class ChristopherTroinaStudent {
    private String name;
    private int grade;
    private String school;
    private String studentID;
    private double gpa;
    private int[] dob;
    private String[] schedule;
    private String address;
    private String counselor;
    private char gender;
    public ChristopherTroinaStudent(String name, int[] dob, char gender, String address, int grade, String school,
                                    String studentID, String[] schedule, String counselor){
        this.name=name;
        this.dob=dob;
        this.gender=gender;
        this.address=address;
        this.grade=grade;
        this.school=school;
        this.studentID=studentID;
        this.schedule=schedule;
        this.counselor=counselor;
    }
    public ChristopherTroinaStudent(String name, int[] dob, char gender, String address, int grade, double gpa, String school,
                                    String studentID, String[] schedule, String counselor){
        this.name=name;
        this.dob=dob;
        this.gender=gender;
        this.address=address;
        this.grade=grade;
        this.school=school;
        this.studentID=studentID;
        this.schedule=schedule;
        this.counselor=counselor;
        this.gpa=gpa;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String getSchool() {
        return school;
    }

    public String getStudentID() {
        return studentID;
    }

    public double getGpa() {
        return gpa;
    }

    public int[] getDob() {
        return dob;
    }

    public String[] getSchedule() {
        return schedule;
    }

    public String getAddress() {
        return address;
    }

    public String getCounselor() {
        return counselor;
    }

    public char getGender() {
        return gender;
    }
    public String toString(){
        return"Name: "+name+"\nDate of birth: "+ Arrays.toString(dob)+"\nGender: "+gender+"\nAddress: "+address+"\nSchool: "
                +school+"\nGrade: "+grade+"\nStudent ID: "+studentID+"\nCounselor: "+counselor+"\nSchedule: "
                +Arrays.toString(schedule)+"\nGPA: "+gpa;
    }
}
