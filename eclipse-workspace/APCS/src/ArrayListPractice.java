import java.util.ArrayList;

public class ArrayListPractice {
	public static void main(String[] args) {
		
		ArrayList<Integer> intAl = new ArrayList<>();
		//#1
		intAl.add(1);
		intAl.add(10);
		intAl.add(4);
		intAl.add(22);
		
		//#2
		intAl.add(1, 100); 	//1, 100, 10, 4, 22
		intAl.add(0, 24);	//24, 1, 100, 10, 4, 22
		intAl.add(5,228);	//24, 1, 100, 10, 4, 228, 22
		
		//#3
		intAl.set(1, 99);	//24, 99, 100, 10, 4, 228, 22
		intAl.set(3, 30);	//24, 99, 100, 30, 4, 228, 22
		
		//#4
		intAl.remove(2);	//24, 99, 30, 4, 228, 22
		intAl.remove(0);	//99, 30, 4, 228, 22
		
		//#5
		System.out.println(intAl.remove(new Integer(3))); //false 99, 30, 4, 228, 22
		System.out.println(intAl.remove(new Integer(99))); //true 30, 4, 228, 22
		
		//#6
		intAl.add(30); //30, 4, 228, 22, 30
		System.out.println(intAl.indexOf(30));//search from first
		System.out.println(intAl.indexOf(300));//return -1 because arraylist doesn't have 300
		
		System.out.println(intAl.lastIndexOf(30));//search from last
		System.out.println(intAl.lastIndexOf(300));//return -1 because arraylist doesn't have 300
		
		//test for checking intAl element
		for(int i = 0; i< intAl.size(); i++) {
			System.out.println(intAl.get(i));
		}
		
	}
}

/**
 * 1. add(Object obj)
 * 		obj를 추가한다.
 * 
 * 2. add(int index, Object obj)
 * 		obj를 index번째에 추가한다.
 * 
 * 3. set(int index, Object obj)
 * 		index에 있는 element를 obj로 바꿔준다.
 * 
 * 4. remove(int index)
 * 		index번째 element 삭제
 * 
 * 5. remove(Object obj)
 * 		obj를 찾아서 삭제. 
 * 		만약, obj가 없으면 return false 있으면 삭제 후 return true
 * 
 * 6. indexOf(Object obj)   ***Searching from first
 * 		obj가 ArrayList에 몇번째 있는지 retrun index
 * 		만약 obj가 ArrayList에 없으면 return -1;
 * 
 * 7. lastIndextOf(Object obj)  ***Searching from last
 * 		obj가 ArrayList에 몇번째 있는지 retrun index
 * 		만약 obj가 ArrayList에 없으면 return -1;
 */
