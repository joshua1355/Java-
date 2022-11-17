import java.util.ArrayList;

public class Arraylist {
	public static void main(String[]args) {
		ArrayList<String> fruits = new ArrayList<>();
 		fruits.add("Hello");
		fruits.add("I am");
		fruits.add("Joshua");
		fruits.add("and");

		fruits.add("and");
		fruits.add("Wong");
		//fruits.remove(1);
//		fruits.add(3,"Jung");
//		fruits.set(2, "Rick");
		//fruits.remove("why");
		for(int i =0; i<fruits.size(); i++) {
			fruits.remove(i);
		}
		ArrayList<Integer> nums = new ArrayList<Integer>();
		int sum = 10;
		while(nums.size() <= sum)
		{
		    nums.add(sum);
		    sum--;
		}

		for(int i = 0; i < nums.size(); i++)
		{
		    if(nums.get(i) %5 == 0)
		    {
		        nums.remove(i);
		    }
		}
		this this this this this thi  i i i i i i i  i  i i i i i i i i i i i i i i i i i i i i i i i i i i i i i i i i i i i i i i i i i i i i i i i i i i i i i i i i ii i i ii i i i i i i ii ii i  i i i
				 ii i i i i i i u u u u u u u u u u u u u u u u u u u u u u u u u u u u u u u u u u uuuuuuuiii u u u uu u u uu u jj j j j j j j j j j jj j j
				 j j j j j j j j j j j j j j j j j j j j j j j j j j j j j j j j j j j j j j  j j j j  j j j j jj    j j j j jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj
				jjjjjjjj
		System.out.println(nums.toString());
		//System.out.println(fruits.remove(1));
		System.out.println(fruits.toString());
		System.out.println(fruits.size()<5? 1: 2);
	}
}
