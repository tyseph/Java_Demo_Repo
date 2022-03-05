package com.cg.feb22.iodemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerDemo {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		System.out.println("EId: ");
		int eid = sc.nextInt();

		System.out.println("Name: ");
		String firstName = sc.next();

		System.out.println("Salary: ");
		double salary = sc.nextDouble();
		
		Employee emp = new Employee(eid, firstName, salary);
		System.out.println(emp.toString());
		
		String file = "D:\\Folder\\out.ser";
		
		FileOutputStream out = new FileOutputStream(file);
		
		ObjectOutputStream os = new ObjectOutputStream(out);
		os.writeObject(emp);
		
		os.close();
		out.close();
		sc.close();
	}
}
