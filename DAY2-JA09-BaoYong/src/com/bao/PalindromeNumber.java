package com.bao;
import java.util.InputMismatchException;
import java.util.Scanner;
public class PalindromeNumber {

	/**
	 * 
	 * @author Boria
	 *
	 */	
	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("������һ��0~9999������"); 
//		 huiWen(3);
          number();
	}
	
   public static void number() {
	   sc = new Scanner(System.in); 
       
    try {
       	int index = sc.nextInt();
     
       	if (index>=10000||index<0) {
       		System.out.println("������涨����"); 
       		number();
        	}
       	else{
       		 if (index/10 >=100) {
           	    System.out.println("����λ��");           	
           	    huiWen(4, index);
            	}
       	     else if (index/10<100&&index/10>=10) {
            	System.out.println("����λ��");
            	huiWen(3, index);
            	}
       	     else if (index/10<10&&index/10>=1) {
        	    System.out.println("�Ƕ�λ��");
        	    huiWen(2, index);
             	}
            else{
        	    System.out.println("�Ǹ�λ��"); 
        	    huiWen(1, index);
               }
        	}
       }
      catch (InputMismatchException e) {
   		   System.out.println("������涨����");
   		   number();
    	   } 
       
   }
   
   public static void huiWen(int x,int index) {
	   int k = (int) Math.pow(10, x);
//	   System.out.println(k);
	   if (x == 1) {
		   System.out.println("���ǻ�����");
	    }
	   else if (x == 2) {
		   if(index/10==index%10){
			   System.out.println("�ǻ�����");
		   }else{
			   System.out.println("���ǻ�����");
		   }
		}
	   else if (x == 3) {
		   if (index/100 == index%10) {
			   System.out.println("�ǻ�����");
		   }else{
			   System.out.println("���ǻ�����");
		   }
		}
	   else if (x == 4) {
		   if (index/1000 == index%10&&index/100==index/10) {
			   System.out.println("�ǻ�����");
		   }else{
			   System.out.println("���ǻ�����");
		   }
		}
	   else {
		System.out.println("�������� ����������");
		number();
	    }
	   
	
   }
}
   	 
  

