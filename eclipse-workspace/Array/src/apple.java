import java.util.*;
public class apple {
	private String produckname;
	private String color;
	
	public apple(String produckname, String color) {
		this.produckname = produckname;
		this.color = color;
	}
		public void setC(String color) {
		        color = color;
		    }

		    public void setPro(String produckname){
		    	produckname = produckname;
		    }

		    public String getPro(){
		        return produckname;
		    }

		    public String getC(){
		        return color;
		    }

		    public String toString(){
		        return "Color: "+color+ "produckname: "+produckname;
		    }
		        public static void main(String[] args){
		            ArrayList<apple> a = new ArrayList<apple>();
		            a.add(new apple("iMac", "black"));
		            a.add(new apple("iPhone 12 pro max", "gold"));
		            a.add(new apple("apple watch", "white"));
		            a.set(0, new apple("apple pen", "blue"));
		
		            System.out.println(a);
		        }
		    }


