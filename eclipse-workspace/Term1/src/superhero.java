/**
 * Write a description of class syntaxerror here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class superhero {
    public static void main(String args[]) {
        int a, b;
        int sum, diff, prod, quotient;
       
        sum = a+b;
        diff = a-b;
        prod = a*b;
        quotient = a/b;
       
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter an integer: ");
        a=scan.nextInt();
        System.out.println("Please enter a second integer:  ");
        b=scan.nextInt();

        System.out.println("The sum of a and b are:  " + sum);
        System.out.println("The difference of a and b are:"   + diff);
        System.out.println("The product of a and b are:  " + prod);
        System.out.println("The + quotient + of + a and b are: " + quotient);
    }
}

