package daythreeassignment.assignment2;

import java.util.Scanner;

public class OddElementsinArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row number");
		int n=sc.nextInt();
		System.out.println("Enter the column number");
		int m=sc.nextInt();
		System.out.println("Insert the numbers in 2d array");
            int arr[][]=new int[n][m];
            
            for (int i = 0; i < arr.length; i++) {
    			for (int j = 0; j < arr[i].length; j++) {
                        arr[i][j]=sc.nextInt();
    			}
    		}
		System.out.println("Odd numbers");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j]%2!=0) {
					System.out.println(arr[i][j]);
				}
			}
		}
	}
}
