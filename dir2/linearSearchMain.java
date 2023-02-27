package dataStructure;

import java.util.Scanner;

public class linearSearchMain {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		 int[] arr= {2,5,6,4,67,34,30};
		 
       System.out.println("enter the element to search:");
       
        int value=s.nextInt();
       System.out.print( linearSearch(arr,value) );
	}
	static boolean linearSearch(int[] a,int val) {
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==val) {
				return true;
			}
		}
		return false;
	}

}
