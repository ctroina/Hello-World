package CH8Classes;

import java.util.Scanner;

public class ChristopherTroinaEMail {
    private String firstName;
    private String lastName;
    private String eMailAddress;
    private String password;
    private int[] dob=new int[3];
    private char gender;
    private String phoneNumber;
    private String currentEMail;
    private String countryOfResidence;
    private String inbox;
    public ChristopherTroinaEMail(String firstName, String lastName, String eMailAddress, String password, int month,
                                  int day, int year, char gender, String countryOfResidence){

        this.firstName=firstName;
        this.lastName=lastName;
        this.eMailAddress=eMailAddress;
        this.password=password;
        dob[0]=month;
        dob[1]=day;
        dob[2]=year;
        this.gender=gender;
        this.countryOfResidence=countryOfResidence;
    }
    public ChristopherTroinaEMail(String firstName, String lastName, String eMailAddress, String password, int month,
                                  int day, int year, char gender, String countryOfResidence, String phoneNumber){

        this.firstName=firstName;
        this.lastName=lastName;
        this.eMailAddress=eMailAddress;
        this.password=password;
        dob[0]=month;
        dob[1]=day;
        dob[2]=year;
        this.gender=gender;
        this.countryOfResidence=countryOfResidence;
        this.phoneNumber=phoneNumber;
    }
    public ChristopherTroinaEMail(String firstName, String lastName, String eMailAddress, String currentEMail, String password, int month,
                                  int day, int year, char gender, String countryOfResidence){

        this.firstName=firstName;
        this.lastName=lastName;
        this.eMailAddress=eMailAddress;
        this.password=password;
        dob[0]=month;
        dob[1]=day;
        dob[2]=year;
        this.gender=gender;
        this.countryOfResidence=countryOfResidence;
        this.currentEMail=currentEMail;
    }
    public ChristopherTroinaEMail(String firstName, String lastName, String eMailAddress, String password, int month,
                                  int day, int year, char gender, String countryOfResidence, String phoneNumber,
                                  String currentEMail){
        this.firstName=firstName;
        this.lastName=lastName;
        this.eMailAddress=eMailAddress;
        this.password=password;
        dob[0]=month;
        dob[1]=day;
        dob[2]=year;
        this.gender=gender;
        this.countryOfResidence=countryOfResidence;
        this.phoneNumber=phoneNumber;
        this.currentEMail=currentEMail;
    }

    public void setFirstName(String firstName) {
        Scanner console=new Scanner(System.in);
        System.out.println("Enter password: ");
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDob(int[] dob) {
        this.dob = dob;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCurrentEMail(String currentEMail) {
        this.currentEMail = currentEMail;
    }

    public String getInbox() {
        return inbox;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String geteMailAddress() {
        return eMailAddress;
    }

    public int[] getDob() {
        return dob;
    }

    public char getGender() {
        return gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCurrentEMail() {
        return currentEMail;
    }

    public String getCountryOfResidence() {
        return countryOfResidence;
    }
}
