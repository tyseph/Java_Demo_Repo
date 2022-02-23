package com.cg.feb22.demo;

import java.util.*;


/* Team 6
 * Sharanya Guha
 * Ghattamaneni Srikanth
 * Vipul Kaushik
 * Sajal Ganjewala
 * Phaneendra Amaradi
*/

public class Problem {

	public static void main(String[] args) {
		// A.1
		System.out.println("A.1)");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.print("\n");
		}

		// A.2
		System.out.println("\nA.2)");
		for (int i = 5; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.print("\n");
		}

		// A.3
		System.out.println("\nA.3)");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

		// A.4
		System.out.println("\nA.4)");
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.print("\n");
		}

		// A.5
		System.out.println("\nA.5");
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println("");
		}

		// B.6
		System.out.println("\nB.6");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int factorial = 1;

		for (int i = 1; i <= n; i++)
			factorial = factorial * i;

		System.out.println("Factorial= " + factorial);

		// B.7
		System.out.println("\nB.7");
		int i, j, count = 0;
		for (i = 2; i <= 100; i++) {
			for (j = 1; j <= i; j++) {
				if (i % j == 0)
					count++;
			}
			if (count == 2)
				System.out.print(" " + i);
			count = 0;
		}

		// B.8
		System.out.println("\nB.8");
		int rem, sum = 0, flag;
		int num = 505;
		flag = num;

		while (num > 0) {
			rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
		}

		if (flag == sum)
			System.out.println("Palindrome");
		else
			System.out.println("not Palindrome");

		// C.1
		System.out.println("\nC.1");
		int n1 = 10;
		int n2 = 20;
		if (n1 == n2) {
			System.out.println("Both are same");
		} else if (n1 > n2) {
			System.out.println(n1 + " is greater than " + n2);
		} else {
			System.out.println(n2 + " is greater than " + n1);
		}

		// C.2
		System.out.println("\nC.2");
		int num1 = 15, num2 = 30, num3;
		num3 = (num1 > num2) ? num2 : num1;
		System.out.println("Smallest between the two numbers is " + num3);

		// C.3
		System.out.println("\nC.3");
//		Scanner sc = new Scanner(System.in);
		int numc3 = sc.nextInt();
		//int numc3 = 5;
		if (numc3 % 2 == 0) {
			System.out.println("Smallest even no " + (numc3 + 2));
			System.out.println("Biggest odd no " + (numc3 - 1));
		} else {
			System.out.println("Smallest even no " + (numc3 + 1));
			System.out.println("Biggest odd no " + (numc3 - 2));
		}

		// C.4
		System.out.println("\nC.4");
		for (i = 1; i <= 5; i++) {
			int d = (int) (Math.random() * 100) + 1;
			System.out.print(d + " ");
		}
		

		// C.5
		System.out.println("\nC.5");
//		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
//		int marks = 69;
		if (marks >= 80 && marks <=100)
			System.out.println("Congratulations you've passed the exam");
		else
			System.out.println("Better luck next time");

		// C.6
		System.out.println("\nC.6");
//		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
//		n = 123;
		sum = 0;
		int product = 1;

		int c = n;
		while (c > 0) {
			sum = sum + (c % 10);
			c = c / 10;
		}
		c = n;
		while (c > 0) {
			product *= (c % 10);
			c = c / 10;
		}
		System.out.println("SUM= " + sum);
		System.out.println("Product= " + product);

		// C.7
		System.out.println("\nC.7");
//		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();

//		n = 5;

		factorial = 1;

		for (i = 1; i <= n; i++)
			factorial = factorial * i;

		System.out.println("Factorial= " + factorial);

		// C.8
		System.out.println("\nC.8");
//		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
//		n = 9582;

		int newNum = 0, a;
		while (n > 0) {
			a = n % 10;
			n = n / 10;
			newNum = newNum * 10 + a;
		}
		System.out.println("Reverse= " + newNum);

		// C.9
		System.out.println("\nC.9");
//		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
//		n = 8;

		n1 = 0;
		n2 = 1;
		int n3;
		System.out.println(n1);
		System.out.println(n2);

		for (i = 2; i < n; i++) {
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}

		// C.10
		System.out.println("\nC.10");
		sum = 0;
		for (i = 101; i < 200; i++) {
			if (i % 7 == 0)
				sum += i;
		}
		System.out.println(sum);

		// C.11
		System.out.println("\nC.11");
		int s=10;
		if(s>1) {
		for(i=1; i <= 10; i++)
        {
            System.out.println(s+"*"+i+"="+s*i);
        }
	}
		else {
			System.out.println("invalid");
		}


		// C.12
		System.out.println("\nC.12");
		int k = 10;
		s = 9;
		int temp = 0;

		temp = 9;
		s = k;
		k = temp;

		System.out.print(s + " " + k);

		// C.13
		System.out.println("\nC.13");
		n = 56;
		
		int month = 0;
		int days = 0;
		while (n >= 30) {
			month = month + 1;
			n = n - 30;

		}
		days = n;
		System.out.println("month-" + month + " days-" + days);

		// C.14
		System.out.println("\nC.14");
		n = 6;
		for (i = 1; i <= n; i++) {
			for (j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= i; k++) {
				System.out.print(" *");
			}

			System.out.println();
		}
		// C.15
		System.out.println("\nC.15");
		int d = 23;
		boolean bool = true;
		for (i = 2; i < d / 2; i++) {
			if (d % i == 0) {
				System.out.println("Not prime");
				bool = false;
				break;
			}
		}
		if (bool == true) {
			System.out.println("prime");
		}

	}
}
