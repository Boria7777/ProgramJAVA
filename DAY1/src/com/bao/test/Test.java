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
    System.out.println("1.注册");
    System.out.println("2.登录");
    System.out.println("3.退出");
    System.out.println("**********");
//    System.exit(0);
    System.out.println("请输入数字");
    Scanner sc = new Scanner(System.in);
    try {
    	int index = sc.nextInt();
    	if (index==1) {
        	System.out.println("请注册");
        	}
        if (index==2) {
        	System.out.println("登录");
        	}
        if (index==3) {
        	System.exit(0);
        	}
	} catch (InputMismatchException e) {
		System.out.println("请输入正确数字");
	}
//    异常处理
    
    
/*
 *  Boolean b = sc.hasNextInt();
 *  if (b == true) {   
 */
    
//    if (sc.hasNextInt() == true) {
//    	int index = sc.nextInt();
//    	if (index==1) {
//        	System.out.println("请注册");
//        	}
//        if (index==2) {
//        	System.out.println("登录");
//        	}
//        if (index==3) {
//        	System.exit(0);
//        	}
//    }
//    else {
//    	System.out.println("请输入正确数字");
//	}
  }
}

