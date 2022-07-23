
public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] ages = { 3, 9, 23, 64, 2, 8, 28, 93, 37};
		
		
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		//difference of the 1st 7 last elements of the array
		
		int lengthOfArray = ages.length;
 		int difference = (ages[lengthOfArray - lengthOfArray] - ages[lengthOfArray - 1]);

 		System.out.println("Difference of first and last element in ages = " + difference);
 		
 		//find the average
 	
 		double sum = 0;
		double average = sum / ages.length;
		for (int number : ages) {
			sum += number;
		}
		double averageAge = sum / ages.length;
		System.out.println("Average Age;" + averageAge);
	
		//2.
		//Create an array of Strings Called names
		//Use a loop to iterate through the array and calculate the average
		//use a loop to iterate through the array and cacatenate names w/ spaces

		
			String [] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; 
			for (int t = 0; t < names.length; t++ ) {
			System.out.println(names[t]);
			}
		
		int letters = 0;
		for (String name : names) {
			letters += name.length();
		}
		System.out.println("Average Number of Letters:" + letters / names.length);
		
		String spaces = " ";
		for (String name : names) {
			spaces += name + " ";
		}
			System.out.println(spaces);
		
			
			//3. How do you access the last element of any array?
			
			
			// answer: lastElement = arry[arry.length -1];
			
			
			//4. How do you access the first element of any array?
			
			
			// answer: with the array name and the index number inside brackets []
			
			
			//5. create a new array of int called nameLengths
			//write a loop to iterate over the names array
			//add the length of each name to the namesLength array
			
			int[] nameLengths = new int[names.length];
	 		for (int i = 0; i < names.length; i++) {
	 			nameLengths[i] = names[i].length(); 
	 		}
			
	 		//6. write a loop to iterate over the namesLength array
	 		// calculate the sum
	 		
	 		sum = 0;
	 		for (int i = 0; i < nameLengths.length; i++) {
	 			sum += nameLengths[i];
	 		}
	 		System.out.println("The sum of all lengths in nameLengths = " + sum);

	 		//7. write a method that takes a String/word/int 
	 		//concatenate (n) amount of times
	 		
	 		String str = "Travis";
	 		 
	 	    System.out.println( str.repeat(3) );
	 	  
	 	    //8.Write a method that takes two Strings, 
	 	    //firstName and lastName, and returns a full name 
	 	    //(the full name should be the first and the last name as a String separated by a space).
	 	    
	 	    String firstName = "Travis";
	 	    String lastName = "Maiden";
	 	    String fullName = firstName + " " + lastName;
	 	    System.out.println(fullName);
	 	    
	 	    //9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is 
	 	    //greater than 100.
	 	   
	 	    int number = 100;
	 	    if  (number >= 100) {
	 	    	System.out.println("True");
	 	    }else {
	 	    	System.out.println("False");
	 	    }
	 	     //10. write an method that takes an array of double 
	 	    //return the average of all of the elements in the array
	 	    int [] numbers = { 23, 15, 34};
	 	    double nextSum = 0;
			double averageSum = nextSum / numbers.length;
			System.out.println("Average is:" + averageSum);

	 	    
	 	   

		
		}
	//11. write a method that takes 2 arrays of double and returns true if he average of the elements in the first array 
	// is greater than the elements in the second array
	public static boolean ifFirstArrayIsGreater(double[] array1, double[] array2) {
		double sum1 = 0;
		for (double x : array1) {
			sum1 += x;
		}
		double sum2 = 0;
		for (double x : array2) {
			sum2 += x;
		} if ((sum1 / array1.length) > (sum2 / array2.length)) {
			return true;
		} else {
			return false;
		}
		
		
		//12. Write a method called willBuyDrink that takes a boolean isHotOutside, 
		//and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	}
	static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	//13.Create a method that solves a problem
	// My problem is I'm hungry. If i have no food in the fridge and more than 15 in my pocket I will eat out. 
	static boolean willEatOut(boolean emptyFridge, double money) {
		if (emptyFridge == true && money > 15) {
			return true;
		} else {
			return false;
		}
	}
		
		
		

		
	

	








	}


