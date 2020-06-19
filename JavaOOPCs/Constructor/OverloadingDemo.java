//this java program shows how overloading of constructor is done in java.

//package JavaNote.JavaOOPCs.Constructor;

public class OverloadingDemo {

    int age;
    String userName;
    String nickName;

    OverloadingDemo(int n , String s){

        age = n;
        userName = s;

    }

    OverloadingDemo(int num , String name1 , String name2){

        age = num;
        userName = name1;
        nickName = name2;

    }

    void Display(){

        System.out.println(age + " " + userName + " aka " + nickName);

    }

    public static void main(String[] args) {

        OverloadingDemo obj01 = new OverloadingDemo(21,"Amir");
        OverloadingDemo obj02 = new OverloadingDemo(20,"Dhiren","Motey");

        obj01.Display();
        obj02.Display();
        
    }
    
}