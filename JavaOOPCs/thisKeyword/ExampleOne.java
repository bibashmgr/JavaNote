// this java program demonstrates how this keyword are used to differentiate local variables and instance variables
// they are used to refer cuurent class instance variable

package JavaNote.JavaOOPCs.thisKeyword;

public class ExampleOne{

    public static void main(String[] args) {

        A obj = new A(10, 'M', "Mikey");

        obj.diplay();
        
    }

}

class A{

    int age;
    char gender;
    String userName;

    A(int age,char gender,String userName){

        this.age = age;
        this.gender = gender;
        this.userName = userName;

    }

    void diplay(){

        System.out.println(age + " " + gender + " " + userName);

    }

}