import java.lang.Math;
import java.util.Arrays;

public class Week3Homework {

	public static void main(String[] args) {
		//Creating an array named ages with current values.//
		int[] ages = {3,9,23,64,2,8,28,93};
		/* finding the difference of the first value from the last value with out using numbers
		to do so.*/
		int lengthOfArr = ages.length;
		int diff = Math.abs(ages[lengthOfArr-lengthOfArr]-ages[lengthOfArr-1]);
		
		System.out.println(diff);
		//declaring new array and repeating the steps above//
		int[] newAges = new int[ages.length];
		//copying values of ages and making newAges//
		System.arraycopy(ages, 0, newAges, 0, ages.length);
		
		lengthOfArr = newAges.length;
		//checking if array was copied//
		System.out.println(lengthOfArr);
		System.out.println(newAges.length);
		
		newAges[lengthOfArr-1] = 25;
		
		//checking to see if the new length of the array will work//
		diff = Math.abs(newAges[lengthOfArr-lengthOfArr]-newAges[newAges.length-1]);
		
		System.out.println(diff);
		
		//creating loop to iterate through array//
		int sum = 0;
		for (int i=0; i < newAges.length; i++) {
			sum += newAges[i]; 

		}
		double average = sum / lengthOfArr;
		
		
		System.out.println("avg newAges" + average); 
		
		//Creating a string of names//
		
		String [] names = {"Sam", "Tommmy", "Tim", "Sally", "Buck", "Bob"};
		//Writing the loop to iterate through the array//
		sum = 0; 
				for (int i =0; i <names.length; i++) {
					sum += names[i].length();
				}
		//declaring average variable //
		average = sum / names.length;
		//Printing out the letter average//
		System.out.println("avg letter[]=" + average);
		// concatenate all the names//

		System.out.println(String.join(" " , names));
		//Using a loop to do this now//
		String togetherNames = "";
		for (int i = 0; i < names.length; i++) {
			togetherNames += names[i] + " ";
		}
		System.out.println(togetherNames);
		//Answering questions 3 and 4
		System.out.println("For the last number we use names.get(names.size()-1)");
		System.out.println("For the first number we would use names.get(0)");
		//Creating a new array called nameLengths
		
		int [] nameLengths = new int[names.length];
		for (int i =0; i < names.length; i++) {
			nameLengths[i]=names[i].length();
		}
		//Writing a loop to iterate over nameLengths
		
		sum = 0 ;
		for (int i=0; i< nameLengths.length; i++) {
			sum += nameLengths[i];
		}
		System.out.println("nameLengths" + sum);
		
		//printing out repeat//
		System.out.println(repeat("hello", 3));
		
		//printing out makeFullName
		System.out.println(makeFullName("Same", "Winchester"));
		
		//printing out if Sum is greater than 100 from out array
		System.out.println(ifSumIsGreater(ages));
		
		//Printing out how many days are in a month of 9 (question 13)
		System.out.println(daysInAMonth(9));
		
		//For number 10 creating an array to show the average
		
		int arr[]= {2, 4, 6, 8, 10, 12, 14};
		int n = arr.length;
		//now printing out average of the array 
		System.out.println(average(arr,n));
		
		//for number 11 arrays
		
		double[] arr1 = {2, 3, 5, 6, 7, 8};
		double[] arr2 = {1, 3, 5, 7, 9, 11};
		System.out.println(equals(arr1, arr2));
		
		
		//for number 12 
		System.out.println(willBuyDrink(true, 11));
		
		
	} 
	
	//Writing method for string and have hello print multiple times//
	public static String repeat(String hello, int n) {
		String repeat ="";
		for (int i =0; i<n; i++) {
			repeat += hello;
		}
		return repeat;
		
	}
	//Writing method that takes two strings firstName and lastName and concats them 
	public static String makeFullName(String firstName, String lastName) {
		return "makeFullName() returns => " + firstName + " " + lastName;
		
		
	}
	//Writing a method that takes an array and returns true if greater than 100//
	public static Boolean ifSumIsGreater(int[]arr) {
	return Arrays.stream(arr).sum() >100;
	}
	
	//Writing a method that takes an array of double and returns the average of the elements//
	
	public static double average(int a[], int n) {
		int sum = 0;
		for (int i = 0; i <n; i++)
			sum += a[i];
		return (double)sum / n;
	}
	
	/*Writing a method that takes two arrays of double and returns true if the average of the elements are
	 *  greater than the average of the average of the elements in the second array*/
	
	public static boolean equals(double[]arr1, double[]arr2) {
		if (arr1.length != arr2.length)
			return false;
		for (int i= 0; i< arr1.length; i++) {
			if (Math.abs(arr1[i]-arr2[i]) >= 1) {
				return false;
			}
		}
		return true;
	}
	
	/*Writing a method called willBuyDrink that takes a boolean isHotOutisde and double 
	moneyInPocket and returns true if hot outside and mIP is greater than 10.50*/
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket >= 10.50) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Writing method that will help figure out how many days are in a month//
	public static int daysInAMonth(int month){
		if (month == 2) {
			return 28;
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		}else {
			return 31;
		}
	} 
	
}

	
	
	
	

	

