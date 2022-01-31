package assessment;

import java.util.Random;

public class Shuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] date ;
     date = new int[10];
     for (int i = 0; i < date.length; ++i) {
    	 date [i]= i ;
     }
     System.out.println("Before the shuffling");
     for (int d: date ) {
    	 
    	 System.out.println(d);
 }
     Random generator;
     generator = new Random();
     
     for (int i = 0; i < date.length; ++i) {
//     Generator random index from 0 to date.length -1
    	 
     int RandomIndex = generator.nextInt(date.length);
     
//   Swap the value in ith place with the randomIndex place
     int temp = date[i];
     date[i] = date[RandomIndex];
     date[RandomIndex] = temp;
     
     }
     
     System.out.println("After shuffle ");
     
     for (int d: date ) {
     System.out.println(d);
     
     }
	}

}
