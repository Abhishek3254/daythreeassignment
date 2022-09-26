package daythreeassignment.assignment2;

import java.util.Scanner;

public class AddTwoMatrics {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first matrices row number");
	int n=sc.nextInt();
	System.out.println("Enter the first matrices column number");
	int m=sc.nextInt();
	System.out.println("Enter the second matrices row number");
	int nn=sc.nextInt();
	System.out.println("Enter the second matrices column number");
	int mm=sc.nextInt();
	if(n==nn&&m==mm){
	  
        int m1[][]=new int[n][m];
        int m2[][]=new int[nn][mm];
        int m3[][]=new int[n][m];
    	System.out.println("Insert the numbers in m1 matrices");
        for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
                    m1[i][j]=sc.nextInt();
			}
		}
        System.out.println("Insert the numbers in m2 matrices");
        for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[i].length; j++) {
                    m2[i][j]=sc.nextInt();
			}
		}
	
	for (int i = 0; i < m1.length; i++) {
		for (int j = 0; j < m1[i].length; j++) {
			m3[i][j]=m1[i][j]+m2[i][j];
			}
		}
	System.out.println("Addition of matrices");
for (int i = 0; i < m3.length; i++) {
	for (int j = 0; j < m3[i].length; j++) {
		System.out.print(m3[i][j]+" ");
		}
	System.out.println();
	}
	}
	else {System.out.println("Indices are not same");}
}
}


