package com.cg.feb22.iodemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoDemo {

	public static void main(String[] args) throws IOException {

		System.out.println("Start");

		String file = "D:\\Folder\\demo.txt";
		String file2 = "D:\\Folder\\demo2.txt";

		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(file2);

		int i = fis.read();
		while (i != -1) {
			System.out.print((char) i);
			fos.write(i);
			i = fis.read();
		}
		fos.close();

	}

}
