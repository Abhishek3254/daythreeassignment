package daythreeassignment.assignment2;
import java.util.Scanner;

public class PrintEvenArrayElements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int ar[]= new int[n];
		System.out.println("Enter the values in array");
		for (int i = 0; i < ar.length; i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println("Even numbers");
		for (int i = 0; i < ar.length; i++) {
			if (ar[i]%2==0) {
				System.out.println(ar[i]);
				
			}
		}
		
	}

}
