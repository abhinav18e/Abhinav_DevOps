package dataStructure;

import java.util.Scanner;

public class insertionSortMain {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int arr[] = new int[6];
		System.out.println("enter the array elements:");
		for(int i=0;i<arr.length;i++)
			arr[i]=s.nextInt();
		s.close();
		int key =0;
		for(int i=1;i<arr.length;i++) {
			key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;		
		}
		System.out.print("array after sorting:  ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");

	}
}
