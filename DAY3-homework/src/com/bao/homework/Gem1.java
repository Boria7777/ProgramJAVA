package com.bao.homework;

public class Gem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("课程名：              coreC++ coreJAVA servlet   JSP     EJB     学生总分");
		int [][]a=new int[20][5];
		int []b = new int[20];
		for (int i = 0; i < 20; i++) {
			
			System.out.print("学生");
			buChong(i+1);
			System.out.print("的成绩为：");
			for (int j = 0; j < 5; j++){
				a[i][j]=(int) (Math.random()*100);
				System.out.print("      ");
				buChong(a[i][j]);
				b[i] = b[i] + a[i][j];
			    }
			
			System.out.print("        ");
			System.out.print(b[i]);
			System.out.println();
			
			}  
		System.out.print("各科平均分：             "); 
		
		avG(a);
		
		}
	
	
	public static void avG(int a[][]) {
		for (int j = 0; j < 5; j++) {
			int k = 0;
			
			for (int i = 0; i < 20; i++) {
				k = k + a[i][j];
				
			}
			
			
			
			System.out.print((k/20)+"      ");
		}
		
		
	}
		
	
	
	
	
	
	
	
	
	
	
	 public static void buChong(int x) {//用于补全成为二位数
		  if (x<10) {
			  System.out.print("0"+x);
			
		      }
		  else{
			  System.out.print(x);
			
		      }
		}
}


