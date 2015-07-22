package com.boria;

public class Gem1 {

		// TODO Auto-generated method stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int []a=new int[20];
			for (int j = 0; j < a.length; j++) {
				a[j]=(int) (Math.random()*100);
				for (int i = 0; i < j; i++) {
					
					if (a[i]==a[j]) {
						j--;
					}
				}
				
			}
			for (int j = 0; j< a.length; j++) {
				System.out.print(a[j]+" ");
			}
			maxMax(a);
			minMin(a);
		}
		
		public static void maxMax(int a[]) {System.out.println();
		   System.out.println("----------------------");
		   System.out.println("以上20位最大的数:");
		   int max_number = a[0];
		   for (int k = 1; k < a.length; k++) {
			
			if (a[k]>max_number) {
				max_number=a[k];
				
			}
			
		}
		System.out.println(max_number);
			
		}
		
		public static void minMin(int a[]) {System.out.println();
		   System.out.println("----------------------");
		   System.out.println("以上20位最小的数:");
		   int min_number = a[0];
		   for (int k = 1; k < a.length; k++) {
			
			if (a[k]<min_number) {
				min_number=a[k];
				
			}
			
		}
		System.out.println(min_number);
			
		}
		
		
	}




