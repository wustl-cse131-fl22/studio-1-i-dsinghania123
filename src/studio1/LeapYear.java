package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner in = new Scanner(System.in);
		System.out.println("What year is it?");
		int year = in.nextInt();
		
		boolean isDivFour = year%4 == 0;
		boolean isNotDivHundred = year%100 != 0;
		boolean isDivFourHundred = year%400 ==0;
		boolean isLeapYear = isDivFour && isNotDivHundred|| isDivFourHundred;
		System.out.println(isLeapYear);
	}

}
