package com.gradedproject.q2;

import java.util.Scanner;

public class GradedProjectQuestion {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the base number X: ");
		int X=sc.nextInt();
		//System.out.print();
		System.out.print("Enter the power N = ");
		int N=sc.nextInt();
        System.out.println("X power N is: "+power(X,N));
        sc.close();
	}

	private static long power(int x, int n) {
		// TODO Auto-generated method stub
		long power=1L;
		for(int i=0;i<n;i++) {
			power=power*x;
		}
		return power;
	}
}
