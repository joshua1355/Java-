
public class TesterLoop {
	public static void main(String[]args) {
		char[] ch = new char[26];
		
		for(int i =0; i< 26; i++) { //arayy 
			ch[i]=(char)(i+65);
			
		}
		Student[] stdArr = new Student[20];
		for(int i = 0 ; i < stdArr.length; i++) {
			stdArr[i] = new Student(i);
		}
		
		for(Student s : stdArr) {
			System.out.println(s.stdNum);
		}
		
		for(int i =0; i< 26; i++) { 
//			System.out.print(ch[i]+ "apple \n");
		}
		boolean apple = 5!=3;

		String a = "joshua";
		System.out.println(a.compareTo("j"));
		double[]sgt = new double[800];
		for(int i=0 ; i< sgt.length; i++) {
			sgt[i] = Math.sqrt(i);
		}
		System.out.println(sgt);
		for(double temp : sgt)
		{
			System.out.println(temp);
		}
		
//			if(i == 4) {
//				break;
			
			//for(int j = 0; j<8; j++) {
			//System.out.println("inner");
			//}
		
	}
	
}

class Student{
	int stdNum;
	Student(int num){
		stdNum = num;
	}
}