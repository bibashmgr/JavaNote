package javalab.Lab05.Question01;

import java.io.*; 

public class MergeFile 
{ 
	public static void main(String[] args) throws IOException 
	{ 

		PrintWriter pw = new PrintWriter("output.txt"); 
		
		BufferedReader br = new BufferedReader(new FileReader("a.txt")); 
		
		String line = br.readLine(); 
        
        while (line != null) 
		{ 
			pw.println(line); 
			line = br.readLine(); 
		} 
		
		br = new BufferedReader(new FileReader("b.txt")); 
		
		line = br.readLine(); 
		 
		while(line != null) 
		{ 
			pw.println(line); 
			line = br.readLine(); 
		} 
		
        pw.flush();
         
		br.close(); 
		pw.close(); 
		
        System.out.println("Merged a.txt and b.txt into output.txt");
        System.out.println("\nComppleted\n"); 
	} 
} 
