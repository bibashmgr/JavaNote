package javalab.Lab02.constructorInJava;

public class Constructor
{
	int rank;
	String name;
	char rarity;

// Default Constructor

	Constructor(){
		rank = 46;
		rarity = 'B';
	}

// Parameterized Constructor

	Constructor(String name, char rarity){
		this.name = name;
		this.rarity = rarity;
    }
    
	Constructor(Constructor obj){
		obj.rank = rank;
		obj.rarity = rarity;
	}//creating object

	void showwinner()
	{
		System.out.println("NAME: " + name);
	}

	void showRank()
	{
		System.out.println("RANK: " + rank);
		System.out.println("RARITY: " + rarity);
	}
}

class ConstructTest
{
	public static void main(String[] args)
	{
		Constructor obj = new Constructor();
		Constructor obj1 = new Constructor("wizard", 'A');
			obj1.showwinner();
		Constructor obj2 = new Constructor(obj);
			obj2.showRank();
	} 
}