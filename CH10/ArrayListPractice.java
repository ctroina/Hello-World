package CH10;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>();
        list.add("the");
        list.add("quick");
        list.add("brown");
        list.add("fox");
        addStars(list);
        removeStars(list);
    }
    public static void addStars(ArrayList<String> list){
        for(int i=1;i<=list.size();i+=2)
            list.add(i,"*");
        System.out.println(list);
    }
    public static void removeStars(ArrayList<String> list){

    }
}
