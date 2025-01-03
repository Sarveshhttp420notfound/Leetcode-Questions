package Leetcode_Question;

import java.util.Scanner;

public class Leetcode_169_Majority_Element {

	public static void main(String[] args) {
		Scanner scn=new Scanner (System.in);
		int n=scn.nextInt();
		
		int[] nums=new int [n];
		for(int i=0;i<n;i++) {
			nums[i]=scn.nextInt();
		}
		
		int a=Majority(nums);
		System.out.println(a);
	}
	
	public static int Majority(int[] nums) {
		Integer number=null;
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if(count==0) {
				number=nums[i];
				count++;
			}
			else if(nums[i]==number) {
				count++;
			}
			else {
				count--;
			}
		}
		return number;
	}

}
