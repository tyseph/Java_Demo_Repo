package com.cg.feb22.demo;

public class ArrayDemo2 {

	public static void main(String[] args) {
		
//		int[] arr = new int[5];
//		int arr2[] = new int[5];
//		int []arr3 = new int[5];
//		
//		for(int i: arr) {
//			System.out.println(i);
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Size");
//		int size = sc.nextInt();
//		int[] arrIn = new int[size];
//		
//		for(int i=0; i<arrIn.length;i++) {
//			System.out.print(i + ": ");
//			arrIn[i] = sc.nextInt();
//		}
//		
//		for(int j: arrIn) {
//			System.out.println(j);
//		}
//		sc.close();
		
		
		int[][] arr2D = new int[3][3];
		
		for(int i=0; i<arr2D.length;i++) {
			for(int j=0; j<arr2D.length; j++) {
				arr2D[i][j] = i + j + 123;
			}
		}
		
		for(int i=0; i<arr2D.length;i++) {
			for(int j=0; j<arr2D.length; j++) {
				System.out.print(arr2D[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		
		
	}
}
