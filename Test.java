package object.oriented;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String name,city,destination;
		int age;
		int numberTicket;
		System.out.println("Please enter your name: ");
		name=input.nextLine();
		System.out.println("Please enter your city: ");
		city=input.next();
		System.out.println("Please enter your age: ");
		age=input.nextInt();
		System.out.println("Please enter your number ticket: ");
		numberTicket=input.nextInt();
		System.out.println("Please enter your destination: ");
		destination=input.next();
		Tickets person1=new Tickets(name, city, age, numberTicket, destination);
		System.out.println("Passenger 1) "+person1);
		person1.setName(name);
      input.close();
	}

}
