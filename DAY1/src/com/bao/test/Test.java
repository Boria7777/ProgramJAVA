package com.bao.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("**********");
    System.out.println("1.ע��");
    System.out.println("2.��¼");
    System.out.println("3.�˳�");
    System.out.println("**********");
//    System.exit(0);
    System.out.println("����������");
    Scanner sc = new Scanner(System.in);
    try {
    	int index = sc.nextInt();
    	if (index==1) {
        	System.out.println("��ע��");
        	}
        if (index==2) {
        	System.out.println("��¼");
        	}
        if (index==3) {
        	System.exit(0);
        	}
	} catch (InputMismatchException e) {
		System.out.println("��������ȷ����");
	}
//    �쳣����
    
    
/*
 *  Boolean b = sc.hasNextInt();
 *  if (b == true) {   
 */
    
//    if (sc.hasNextInt() == true) {
//    	int index = sc.nextInt();
//    	if (index==1) {
//        	System.out.println("��ע��");
//        	}
//        if (index==2) {
//        	System.out.println("��¼");
//        	}
//        if (index==3) {
//        	System.exit(0);
//        	}
//    }
//    else {
//    	System.out.println("��������ȷ����");
//	}
  }
}

