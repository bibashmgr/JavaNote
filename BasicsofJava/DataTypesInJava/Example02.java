// This shows how float values are narrowed(i.e changed) into integer values

package java.Note.BasicsofJava.DataTypesInJava;

public class Example02 {

    public static void main(String[] args) {

        float b = 10.5f;

        // int a = f ; 
        // the above line shows compile error

        int a = (int)f;

        System.out.println(f);

        System.out.println(a);

    }

}