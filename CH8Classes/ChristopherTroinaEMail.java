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
    private boolean passwordEntered;
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
        if(!passwordEntered) {
            System.out.println("Enter password: ");
            String enterPassword=console.next();
            while (!enterPassword.equals(password)){
                System.out.println("Wrong password, try again ");
                enterPassword=console.next();
            }
            passwordEntered=true;
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        Scanner console=new Scanner(System.in);
        if(!passwordEntered) {
            System.out.println("Enter password: ");
            String enterPassword=console.next();
            while (!enterPassword.equals(password)){
                System.out.println("Wrong password, try again ");
                enterPassword=console.next();
            }
            passwordEntered=true;
        }
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        Scanner console=new Scanner(System.in);
        System.out.println("Enter old password: ");
        String enterPassword=console.next();
        while (!enterPassword.equals(this.password)){
            System.out.println("Wrong password, try again ");
            enterPassword=console.next();
        }
        passwordEntered=true;
        this.password = password;
    }

    public void setDob(int month, int day, int year) {
        Scanner console=new Scanner(System.in);
        if(!passwordEntered) {
            System.out.println("Enter password: ");
            String enterPassword=console.next();
            while (!enterPassword.equals(password)){
                System.out.println("Wrong password, try again ");
                enterPassword=console.next();
            }
            passwordEntered=true;
        }
        dob[0] = month;
        dob[1]=day;
        dob[2]=year;
    }

    public void setGender(char gender) {
        Scanner console=new Scanner(System.in);
        if(!passwordEntered) {
            System.out.println("Enter password: ");
            String enterPassword=console.next();
            while (!enterPassword.equals(password)){
                System.out.println("Wrong password, try again ");
                enterPassword=console.next();
            }
            passwordEntered=true;
        }
        this.gender = gender;
    }

    public void setPhoneNumber(String phoneNumber) {
        Scanner console=new Scanner(System.in);
        if(!passwordEntered) {
            System.out.println("Enter password: ");
            String enterPassword=console.next();
            while (!enterPassword.equals(password)){
                System.out.println("Wrong password, try again ");
                enterPassword=console.next();
            }
            passwordEntered=true;
        }
        this.phoneNumber = phoneNumber;
    }

    public void setCurrentEMail(String currentEMail) {
        Scanner console=new Scanner(System.in);
        if(!passwordEntered) {
            System.out.println("Enter password: ");
            String enterPassword=console.next();
            while (!enterPassword.equals(password)){
                System.out.println("Wrong password, try again ");
                enterPassword=console.next();
            }
            passwordEntered=true;
        }
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
    public String toString(){
        return firstName+" "+lastName+":\nAddress: "+eMailAddress+"\nDate of Birth: "+dob[0]+"/"+dob[1]+"/"+dob[2]+
                "\nGender:"+gender+"\nCountry of Residence: "+countryOfResidence;
    }
}
