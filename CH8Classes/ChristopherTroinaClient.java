package CH8Classes;

import java.util.Arrays;

public class ChristopherTroinaClient {
    public static void main(String[] args){
        bicycle();
        student();
        tree();
        dog();
        eMail();
    }

    public static void bicycle() {
        System.out.println("Bicycle: ");
        ChristopherTroinaBicycle bike=new ChristopherTroinaBicycle("new",false,12,99.99,"green");
        ChristopherTroinaBicycle bike2=new ChristopherTroinaBicycle("eh",true,7,.02,"orange", 27);
        System.out.println("Bike 1:\n"+bike+"\nBike 2:\n"+bike2);
        for(int i=1;i<=2;i++)
            bike.buy();
        for(int i=1;i<=2;i++)
            bike2.sell(1000);
        bike.breaking();
        bike2.speedUp(100);
        bike2.slowDown(10);
        bike.setCondition("bad");
        bike.setGears(5);
        bike.setColor("lavender");
        System.out.println("Bike 1 condition: "+bike.getCondition());
        System.out.println("Bike 1 gears: "+bike.getGears());
        System.out.println("Bike 1 color: "+bike.getColor());
        System.out.println("Bike 1 price: "+bike.getPrice());
        System.out.println("Bike 1':\n"+bike+"\nBike 2':\n"+bike2);
        bike.releaseBreak();
        System.out.println("Bike 1'':\n"+bike);
    }

    public static void student() {
        System.out.println("\nStudent:");
        int[] dob={6,3,12};
        String[] schedule={"US History","Computer Science", "Gym", "English", "Science Lab", "Science", "Math", "French"};
        ChristopherTroinaStudent student=new ChristopherTroinaStudent("Christopher Troina", dob, 'm',
                "333 Street, Rd, Mamaroneck, NY, 10543", 11, "Mamaroneck High School",
                "1111", schedule, "Lichenstein");
        ChristopherTroinaStudent student2=new ChristopherTroinaStudent("Christopher Troina", dob, 'm',
                "333 Street, Rd, Mamaroneck, NY, 10543", 11,5, "Mamaroneck High School",
                "1111", schedule, "Lichenstein");
        System.out.println("Student 1:\n"+student+"\nStudent 2:\n"+student2);
        System.out.println("Student 1 name: "+student.getName());
        System.out.println("Student 1 grade: "+student.getGrade());
        System.out.println("Student 1 school: "+student.getSchool());
        System.out.println("Student 1 student ID: "+student.getStudentID());
        System.out.println("Student 1 GPA: "+student.getGpa());
        System.out.println("Student 1 date of birth: "+student.getDob()[0]+"/"+student.getDob()[1]+"/"+student.getDob()[2]);
        System.out.println("Student 1 schedule: "+Arrays.toString(student.getSchedule()));
        System.out.println("Student 1 address: "+student.getAddress());
        System.out.println("Student 1 counselor: "+student.getCounselor());
        System.out.println("Student 1 gender: "+student.getGender());
    }

    public static void tree() {
        System.out.println("\nTree:");
        ChristopherTroinaTree tree=new ChristopherTroinaTree(50, 10, 190, "Oak");
        System.out.println(tree);
        tree.grow(-5,-9,-2);
        tree.grow(5,9,2);
        tree.notAlive();
        System.out.println(tree.getHeight());
        System.out.println(tree.getWidth());
        System.out.println(tree.getAge());
        System.out.println(tree.getSpecies());
        System.out.println(tree.isAlive());
        tree.chopDown(100);
        tree.chopDown(35);
        System.out.println(tree);
    }

    public static void dog() {
        System.out.println("\nDog:");
        ChristopherTroinaDog dog=new ChristopherTroinaDog(5, 10, 20, 7, "bulldog");
        System.out.println(dog);
        dog.setWalking(true);
        System.out.println(dog);
        dog.setWalking(false);
        dog.setSleeping(true);
        System.out.println(dog);
        dog.setWalking(true);
        System.out.println(dog);
        System.out.println("Height: "+dog.getHeight());
        System.out.println("Length: "+dog.getLength());
        System.out.println("Weight: "+dog.getWeight());
        System.out.println("Age: "+dog.getAge());
        System.out.println("Breed: "+dog.getBreed());
        System.out.println("Walking: "+dog.isWalking());
        System.out.println("Sleeping: "+dog.isSleeping());
    }

    public static void eMail() {
        System.out.println("\ne-Mail:");
        ChristopherTroinaEMail eMail=new ChristopherTroinaEMail("Christopher", "Troina",
                "Ctroina@student.mamkschools.org", "password", 6, 3, 2002,
                'm', "America");
        ChristopherTroinaEMail eMail2=new ChristopherTroinaEMail("Christopher", "Troina",
                "Ctroina@student.mamkschools.org", "password", 6, 3, 2002,
                'm', "America", "999-999-9999");
        ChristopherTroinaEMail eMail3=new ChristopherTroinaEMail("Christopher", "Troina",
                "Ctroina@student.mamkschools.org", "Ctroina2@mamkschools.org",
                "password", 6, 3, 2002, 'm', "America");
        ChristopherTroinaEMail eMail4=new ChristopherTroinaEMail("Christopher", "Troina",
                "Ctroina@student.mamkschools.org", "password", 6, 3, 2002,
                'm', "America", "999-999-9999",
                "Ctroina2@student.mamkschools.org");
        System.out.println(eMail4);
        eMail4.setFirstName("Yes");
        eMail4.setLastName("No");
        eMail4.setDob(4, 5, 1888);
        eMail4.setGender('o');
        eMail4.setPhoneNumber("333-333-3333");
        eMail4.setCurrentEMail("Yes@gmail.com");
        eMail4.setPassword("password1");
        System.out.println(eMail4.getFirstName());
        System.out.println(eMail4.getLastName());
        System.out.println(eMail4.geteMailAddress());
        System.out.println(eMail4.getCurrentEMail());
        System.out.println(Arrays.toString(eMail4.getDob()));
        System.out.println(eMail4.getCountryOfResidence());
        System.out.println(eMail4.getGender());
        System.out.println(eMail4.getPhoneNumber());
        System.out.println(eMail4.getInbox());
    }
}
