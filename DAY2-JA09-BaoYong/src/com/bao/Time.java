package com.bao;

import java.util.Scanner;

/**
 * 
 * @author Boria
 *
 */
public class Time {
	private static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����������");
		shuZi();
	}
  public static void shuZi() {
	  sc = new Scanner(System.in); 
	  int index = sc.nextInt();

	  int c = index%60;
	  int b = index%3600/60;
	  int a = index/3600;
	  buChong(a);
	  System.out.print(":");
	  buChong(b);
	  System.out.print(":");
	  buChong(c);
  }
  public void paiXu(int q) {
	  
	
}
  public static void buChong(int x) {//���ڲ�ȫ��Ϊ��λ��
	  if (x<10) {
		  System.out.print("0"+x);
		
	      }
	  else{
		  System.out.print(x);
		
	      }
	}
}
