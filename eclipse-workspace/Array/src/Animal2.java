import java.util.ArrayList;
import java.util.List;
public class Animal2 {
	private List<String> animals;
	
	public void manipulate() {
		 for( int k =animals.size()-1; k>0;){
	            if(animals.addAll(k).substring(0,1).equals("b")){
	                animals.add(animals.size()-k,animals.remove(k));
	                
	            }
	        }
	}
	
	   private String x;
	    private String y;
	    private boolean canFly;
	    public Animal2(String a, String c, boolean cf){
	        x= a;
	        y=c;
	        canFly =cf;
	    }
	    public Animal2(String c, String a, boolean cf){
	        x =a;
	        y= c;
	        canFly = cf;
	    }
	    
    public static void main(String[] args){
	        ArrayList<String> animals = new ArrayList<>();
	        animals.add("bear");
	        animals.add("zebra");
	        animals.add("bass");
	        animals.add("cat");
	        animals.add("koala");
	        animals.add("baboon");
	        animals.add(5,animals.remove(6));
	        System.out.println(animals);
	        
        for( int k =animals.size()-1; k>0;){
            if(animals.add(k).substring(0,1).equals("b")){
                animals.add(animals.size()-k,animals.remove(k));
                
            }
        }


    }
}
