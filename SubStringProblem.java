package daythreeassignment.assignment3;

import java.util.Scanner;

public class SubStringProblem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		System.out.println("Enter the first indices");
		int i1=sc.nextInt();
		System.out.println("Enter the second indices");
		int i2=sc.nextInt();
		String st="";
		char ch[]=str.toCharArray();
		System.out.println("Substring");
		for (int i = i1; i < i2; i++) {
			st=st+ch[i];
		}
		System.out.println(st);
		
		
	}

}
