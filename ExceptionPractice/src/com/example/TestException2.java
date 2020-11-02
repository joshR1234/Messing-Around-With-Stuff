package com.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TestException2 {

	public static void readFile(String fname) throws Exception, FileNotFoundException {
		FileReader fr = new FileReader(fname);
		Scanner sc = new Scanner(fr);
		System.out.println(sc.nextLine());
		System.out.println("1");
	}

	public static void main(String[] args) {
		String fileName = "D:\\Batch52\\data.txt";

		try {
			readFile(fileName);
		} catch (FileNotFoundException e) {
			System.out.println("Error :" + e.getMessage());
		} catch (Exception ex) {
			System.out.println("Error :" + ex.getMessage());

		}

		System.out.println("2");

	}

}
