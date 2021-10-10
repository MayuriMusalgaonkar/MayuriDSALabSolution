package com.learning.main;

import java.util.Scanner;

import com.learning.services.CheckBalanceService;

public class Driver {

	public static void main(String[] args) {		
		
		Scanner sc= new Scanner(System.in);
		
		//get user input
		System.out.println("Enter the String that contain Brackets");
		String expression=sc.next();
		
		//check if String is balance or not and print the result
		boolean result = CheckBalanceService.checkbalance(expression);
		
		if (result)
			System.out.println("The entered String has Balanced Brackets");
		else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}

	
}
