package Leetcode_Question;

import java.util.Scanner;

public class Leetcode_769_Max_chunk_to_make_sorted {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		
		int[] arr=new int [n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		
		int a=chunks(arr);
         System.out.println(a);
	}
	public static int chunks(int[] arr) {
		if(arr.length==0) {
			return 0;
		}
		int count=0;
		int max =Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			max=Math.max(max, arr[i]);
			if(max==i) {
				count++;
			}
		}
		return count;
	}

}
