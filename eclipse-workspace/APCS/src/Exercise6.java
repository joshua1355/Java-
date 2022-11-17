import java.util.ArrayList;

public class Exercise6 {
	public static void main(String args[]){
//		String a = "apple";
//		String b = "";
//		for(int i = a.length()-1; i >= 0; i--) {
//			b = b + a.substring(i,i+1);
//		}
//		
//		System.out.print(b);
		LolCharacter lc;      
		lc = new LolCharacter("Yasuo", 100, 400, 350);
		LolCharacter ad = new LolCharacter("ash", 120, 300, 350);
		LolCharacter lc1;
		lc1 = new LolCharacter("Yasuo1", 100, 400, 350);
		LolCharacter lc2;
		lc2 = new LolCharacter("Yasuo2", 100, 400, 350);
		LolCharacter lc3;
		lc3 = new LolCharacter("Yasuo3", 100, 400, 350);
		LolCharacter lc4;
		lc4 = new LolCharacter("Yasuo4", 100, 400, 350);
		LolCharacter lc5;
		lc5 = new LolCharacter("Yasuo5", 100, 400, 350);
		LolCharacter lc6;
		lc6 = new LolCharacter("Yasuo6", 100, 400, 350);
		LolCharacter lc7;
		lc7 = new LolCharacter("Yasuo7", 100, 400, 350);
		LolCharacter lc8;
		lc8 = new LolCharacter("Yasuo", 100, 400, 350);
		LolCharacter [] lcArr = new LolCharacter[10];
		lcArr[0] = lc;
		lcArr[1] = lc1;
		lcArr[2] = lc2;
		lcArr[3] = lc3;
		lcArr[4] = lc4;
		lcArr[5] = lc5;
		lcArr[6] = lc6;
		lcArr[7] = lc7;
		lcArr[8] = lc8;
		
		ArrayList<LolCharacter> lcAl = new ArrayList<>();
		lcAl.add(lc1);
		lcAl.add(lc2);
		lcAl.add(lc3);
		lcAl.add(lc4);
		lcAl.add(lc5);
		lcAl.add(lc6);
		lcAl.add(lc7);
		lcAl.add(lc8);
		lcAl.add(lc);
		
		
		int l = lcArr.length;
		int size = lcAl.size();
		
		
		
		
		for(int i=0; i<lcAl.size(); i++) { //size == 9 
			lcAl.get(i).showStatus();
			lcArr[i].showStatus();
		}
		
	
		
		
		
		lcArr[0].showStatus();
		ad.showStatus();
		
		lcArr[0].attack(ad);
		ad.attack(lcArr[0]);
		
		lcArr[0].showStatus();
		ad.showStatus();
		
		
	}

	public static void print(String a) {
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
	}
	
	
}
