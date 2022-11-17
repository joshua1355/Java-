
public class Practice1 {
	public static void main (String[] args)
    {
        int score = 90;
        String grade = "";
        if(score >= 90) {
        	grade = "A";
            System.out.println("you got a(n) "+grade+"!");

        } 
        else if(score >=80) {
        	grade = "B";
            System.out.println("you got a(n) "+grade+"!");

        }
        else if(score >=70) {
        	grade = "C";
            System.out.println("you got a(n) "+grade+"!");

        } 
        else if(score >=60) {
        	grade = "D";
            System.out.println("you got a(n) "+grade+"!");

        }

        
    }
}
