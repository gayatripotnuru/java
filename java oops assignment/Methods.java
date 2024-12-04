package basic;

import java.util.*;
import java.util.Arrays;

public class Methods {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Gayatri";                                                               // calling String
		String result = reverseString(input);
		System.out.println("Reversed String: " + result);
		int[] numbers = { 12, 34, 54, 78, 32, 45, 67 };                             // calling Array
		int max = findMax(numbers);
		System.out.println("Maximum Value: " + max);
		String str = "Gayatri";                                                                   // calling characters
		int vowelCount = countVowels(str);
		System.out.println("Number of vowels: " + vowelCount);
		int number = 5;                                                                             // calling numbers
		int fact1 = factorial(number);
		System.out.println("factorial of " + number + " is: " + fact1);
		int number1 = 1234;                                                                       // calling numbers
		int result1 = sumOfDigits(number1);
		System.out.println("Sum of the digits:" + result1);
		int number2=1234;
		int reverse=reverseOfNumber(number2);
		System.out.println("reverse of number is:"+reverse);
		

	}

	public static String reverseString(String input) { // reversedString
		String reversed = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			reversed = reversed + input.charAt(i);
		}
		return reversed;
	}

	public static int findMax(int[] array) { // maximumArray
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static int countVowels(String str) {
		int Count = 0;
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				Count++;
			}
		}
		return Count;
	}

	public static int factorial(int number) {
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static int sumOfDigits(int number1) {
		int sum = 0;
		while (number1 > 0) {
			int digit = number1 % 10;
			sum = sum + digit;
			number1 = number1 / 10;

		}
		return sum;
	}
	public static int reverseOfNumber(int number2) {
		int rev=0;
		while(number2>0) {
			int digit1=number2%10;
			rev=rev*10+digit1;
			number2=number2/10;
		}
		return rev;
	}
}
