import java.util.*;
public class Replaces {
	private String name;
	public Replaces(String name) {
		this.name = name;
	}
	public void repl(String repl,String taget) {
		name= name.substring(0,name.indexOf(taget))+repl+name.substring(name.indexOf(taget)+taget.length());
	}
    public static boolean equals(ArrayList<String> array1, ArrayList<String> array2)
    {
        if(array1.size()!=array2.size()){
            return false;
        }
        for(int i =0; i<array1.size(); i++){
            if(!array1.get(i).equals(array2.get(i))){
                return false;
            }
        }
        return true;
    }
    public int search(ArrayList<Integer> list, String target)
    {
    	for(Integer k: list)
        {
            if(target.equals(k.get()))
            {
                return i;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		String a = "hello world";
		String target = "llo";
		String repl = "zzzz";
		String ab="";
		for(int i =0; i<a.length(); i++) {
			ab+=a.substring(0,target.indexOf(i)+repl+a.substring(target.indexOf(i)+target.length()));
		}
		
		
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("Hello");
//		list.add("World");
//		System.out.println(list);
//		ArrayList<String> arr = new ArrayList<String>();
//		//Replaces a2 = new Replaces();
//		Replaces a1 =  new Replaces(list.get(0));
//		a1.repl("no", "lo");
//		System.out.println(a1);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		
		int counter = 0;
		while(counter < list.size())
		{
		    counter++;
		    list.set(counter, list.get(counter)+5);
		}
		System.out.println(list.toString());
	}
}
