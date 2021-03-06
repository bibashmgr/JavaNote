package javalab.Lab03.abstractClassInJava;

abstract class Car
{
	abstract void Color();
	abstract boolean isLamborghini();
}

class Expensive extends Car
{
	//overRidding the abstract class
	void Color(){
		System.out.println("It is red in color");
	}

	boolean isLamborghini()
	{
		return true;
	}
}


class Cheap extends Car
{   
    void Color(){
		System.out.println("I want lamborghini.");
	}
 
	boolean isLamborghini()
	{
		return false;
	}
}

class AbstractClass
{
	public static void main(String[] args) {

        Expensive obj1 = new Expensive();
        
        obj1.Color();

		System.out.println("It is Lamborghini " + obj1.isLamborghini());


        Cheap obj2 = new Cheap();

        System.out.println("It is lamborghini" + obj2.isLamborghini());
        
        obj2.Color();

        
	}
}