import java.util.Scanner;

public class Numbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int b = sc.nextInt();
        if(b>0){
            System.out.println("The number is postive!");
        }else{
            System.out.println("The number is negative!");
        }
    }
}

