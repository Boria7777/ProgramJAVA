package com.bao.test;
/**
 * 
 * @author Boria
 *
 */
public class Zhishu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int q =0;
		for (int i = 2; i <= 1000; i++) { // ����
            for (int k = 2; k <= i; k++) { // ����
                
                if (i % k == 0 && i != k) {
                    break;
                }
                
                if (i % k == 0 && i == k) {
                    System.out.print(i+" ");
                    q++;
                    if(q%8 == 0){
                    	System.out.println();
                    }
                }
            }
        }
	 }
  }


