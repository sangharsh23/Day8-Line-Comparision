package com.bridgelabz.line.comparision;

import java.util.Scanner;

public class LineComparision {
public static int x1,x2,y1,y2,p1,p2,q1,q2;
public static Double lengthOfLine1,lengthOfLine2;
	public static void main(String[] args) {
		System.out.println("Welcome to the line comparision program");
		getLengthOfLine();
		checkEquality();
	}

	public static void getLengthOfLine() {

		Scanner line = new Scanner(System.in);

		System.out.println("Enter the Value of x Co-ordinate 1st point: ");
		 x1 = line.nextInt();
		System.out.println("Enter the Value of y Co-ordinate  1nd point: ");
		 y1 = line.nextInt();
		System.out.println("Enter the Value of x Co-ordinate 2nd point: ");
		 x2 = line.nextInt();
		System.out.println("Enter the Value of y Co-ordinate 2nd point: ");
		 y2 = line.nextInt();

		System.out.println("Enter the Value of x Co-ordinate 3rd point: ");
		 p1 = line.nextInt();
		System.out.println("Enter the Value of y Co-ordinate 3rd point: ");
		 q1 = line.nextInt();
		System.out.println("Enter the Value of x Co-ordinate 4th point: ");
		 p2 = line.nextInt();
		System.out.println("Enter the Value of y Co-ordinate 4th point: ");
	     q2 = line.nextInt();
        
	}

	public static void checkEquality() {
		 lengthOfLine1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("Length Of line1 = " + lengthOfLine1);
		 lengthOfLine2 = Math.sqrt((p2 - p1) * (p2 - p1) + (q2 - q1) * (q2 - q1));
		System.out.println("Length of line2 = " + lengthOfLine2);
		boolean equality = lengthOfLine1.equals(lengthOfLine2);
		if (equality)
			System.out.println("Both line are equal");

		else
			System.out.println("Both line are not equal");
	}
}
