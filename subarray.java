package ds;

import java.util.*;

public class Subarray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		System.out.println("enter the value of array");
		int k=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements in array");
		for(int i=0;i<n;i++)
		
			arr[i]=sc.nextInt();
			int count=0;
			n=n-k+1;
		   count=n*(n+1)/2;
		   System.out.println("output:");
		   System.out.println(count);
		
		

	}

}
