import java.util.ArrayList;
public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> std = new ArrayList<>();
		std.add("stirng");
		std.add("World");
		std.set(0, "hi");
		for(int i =0; i<std.size(); i++) {
			std.set(i, std.get(i));
		}
		System.out.println(std);
//		for(String a : std) {
		System.out.println(std.size()<5? "hi":"");
//		}
		ArrayList1 a1 = new ArrayList1();
		a1.swapPairs("E","hi");
		System.out.println(a1);
	}
	public void swapPairs(ArrayList<String> list) {
	    for(int i = 0; i <= list.size() - 2; i += 2) {
	        String str = list.get(i + 1);
	        list.set(i + 1, list.get(i));
	        list.set(i, str);
	    }
	}

}
