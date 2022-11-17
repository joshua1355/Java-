
public class Substring {
String machineId;
String description;
	public boolean cotainsWord(String keyword) {
		if(description.indexOf(keyword)==-1) {
			return false;
		}
		if(!description.substring(0,keyword.length()).equals(keyword)|| description.indexOf(" ")!=-1) {
			return false;
		}
		if(description.substring(description.length()-keyword.length()).equals(keyword)||description.indexOf(keyword+ "")) {
			return true;
			
		}
	}
	public static void main (String[] args) {
		String a = "Hello World";
		String ab= "tanava";
		String a1="";
		String repl = "endsssss";
		for(int i =0; i<ab.length()-1; i++) {
			if(ab.substring(i,i+1).equals("a")) {
				ab=ab.substring(0,i+1)+a.substring(i+1,i+2)+a.substring(i,i+1)+a.substring(i+2);
			}
				
		}
		a=a.substring(0,1)+repl+a.substring(1+repl.length());
		System.out.println(a1);
		
	}
}
