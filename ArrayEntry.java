
import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;


public class ArrayEntry {

	
	public static void main(String[] args)
	{
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>(n);
		
		for(int i=0; i<n; i++){
		    al.add(Integer.parseInt(sc.next()));
		}

	

		// Printing all string el=ntries inside the Set
		System.out.println("ArrayList elements : " + al);
	}
}
