package com.example;

import java.io.*;

public class TestException {
	public static int sum(int[] nums) throws Exception, IndexOutOfBoundsException {
		int total = 0;

		for (int i = 0; i <= 12; i++) {
				total += nums[i];
			}

		System.out.println("End of Sum");
		return total;
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		try {
			System.out.println(sum(numbers));
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Error1 :" + e.getMessage());
		} catch (Exception ex) {
			System.out.println("Error2 :" + ex.getMessage());

		}
		
		System.out.println("End of Main");
	}
}
