package assessment;

import java.util.Scanner;

public class Procedural {
	public static int getWeight() { //create getWeight methods
		int weight;   // declare variable weight
		Scanner inputWeight=new Scanner(System.in);  // declare Scanner object

		System.out.println("Please enter your weight: "); 
		weight=inputWeight.nextInt(); //take data from the user and save input in weight
		inputWeight.close(); //close scanner object
		return weight; //return value weight
	}
	public static void main(String[] args) {
		int weight=getWeight();
	   if(weight>=90 ) {  //call method getWight and compare between weight anf number(90)
		 System.out.println("Your weight is: "+weight+" 'over' !");
	 }
	 else {
		 System.out.println("Your weight is: "+weight+" 'good' !");
	 }
	}

}
