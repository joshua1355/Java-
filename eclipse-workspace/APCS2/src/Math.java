import java.util.*;
import java.awt.*;
public class Math {

	public static void main(String[] args) 
	{
//		World habitat = new World(300,300);
//		Turtle yertle = new Turtle(habitat);

//	      yertle.forward();
//	      yertle.turnLeft();
//	      yertle.forward();
//
//	      habitat.show(true);
	      int[] std = new int[10]; 
	      std[0] = 10;
	      for(int i = 0; i<std.length; i++) {
	    	  System.out.println("Hello world ");
	      }
	      System.out.println(std[0]);
	      
	}
	public static void swapPairs(String[] array) {
	    int alen = array.length/2;
	    for (int i = 0; i < alen; i++) {
	        String a = array[2 * i];
	        array[2 * i] = array[2 * i + 1];
	        array[2 * i + 1] = a;
	    }
	    
	}
}
