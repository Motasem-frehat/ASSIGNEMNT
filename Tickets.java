package object.oriented;

public class Tickets extends Person{
	// private instance variable
 private int numberTickets;
 private String destination;
 
//Constructor instance with the given inputs
public Tickets(String name, String nameCity, int age, int numberTickets, String destination) {
	super(name, nameCity, age);
	this.numberTickets = numberTickets;
	this.destination = destination;
}
// The public getters and setters for the private instance variables.

public int getNumberTickets() {
	return numberTickets;
}

public void setNumberTickets(int numberTickets) {
	this.numberTickets = numberTickets;
}

public String getDestination() {
	return destination;
}

public void setDestination(String destination) {
	this.destination = destination;
}

//Override the inherited method to describe itself
@Override
public String toString() {
	return super.toString()+ ", Number Tickets="  + numberTickets + ", Destination= " + destination +   "";
} 
 }

	

