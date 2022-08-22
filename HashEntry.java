import java.io.*;
import java.util.*;
import java.util.Scanner;


public class HashEntry {

	
	public static void main(String[] args)
	{
		// Creating an empty HashSet of string entities
		HashSet<Integer> hs = new HashSet<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++){
		    hs.add(Integer.parseInt(sc.next()));
		}

	

		// Printing all string el=ntries inside the Set
		System.out.println("HashSet elements : " + hs);
	}
}
