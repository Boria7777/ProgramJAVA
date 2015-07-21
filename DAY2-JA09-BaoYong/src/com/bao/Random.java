package com.bao;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a=new int[20];
		for (int j = 0; j < 20; j++) {
			a[j]=(int) (Math.random()*100);
			for (int i = 0; i < j; i++) {
				
				if (a[i]==a[j]) {
					j--;
				}
			}
			
		}
		for (int j = 0; j< 20; j++) {
			System.out.print(a[j]+" ");
		}
	}
}
