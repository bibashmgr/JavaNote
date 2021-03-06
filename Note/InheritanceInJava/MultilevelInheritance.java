package javalab.Lab03.inheritanceInJava;

class GrandParents // parent class
{ 
    public void msgOne() // parent method
    { 
        System.out.println("This is Grandpa Tray,my grandson Max."); 
    } 
} 
  
class Children extends GrandParents // child class
{ 
    public void msgTwo() // child method
    { 
        System.out.println("This is your dad Leo,my son Max."); 
    } 
} 

class GrandChildren extends Children // sub-child class inheriting child class
{ 
    public void msgThree()
    { 
        System.out.println("Hello,I am Max."); 
    } 
} 

class MultilevelInheritance
{ 
    public static void main(String[] args) 
    { 

        GrandChildren obj = new GrandChildren(); 

        obj.msgThree();;
        obj.msgTwo();  // inheriting the method of child class
        obj.msgOne();;  // inheriting the method of parent class
     
    } 
} 