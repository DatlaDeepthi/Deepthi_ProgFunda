package com.gradedproject.q2;

import java.util.Scanner;
public class ValueOfXpowerN
{
	private static int power(int X,int N)
	{
		if(N==0)
		{
			return 1;
		}
		int r=power(X, N/2);  
		if(N%2==0)
		{
			return r*r;
		}
		else
		{
			return r*r*X;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base number X:");
		int num=sc.nextInt();
		System.out.println("Enter the Power N=");
		int p=sc.nextInt();
		System.out.println("X power N is:"+power(num,p));
	}
}