package javalab.Lab02.finalInJava;

public class FinalKey
{
	static final int num1 = 10;

	final char letter;
	
	FinalKey(){
		
		letter = 'x';
		
	}

	public static void main(String[] args) {
		FinalKey obj = new FinalKey();

		System.out.println(num1);
		System.out.println(obj.letter);
	}

}