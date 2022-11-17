
public class LolCharacter {
	//instance variable
	String name;
	int attack;
	int movingSpeed;
	double hp;
	
	//constructor
	public LolCharacter(String n, int att, int speed, double health) {
		name = n;
		attack = att;
		movingSpeed = speed;
		hp =health;
	}
	// method
	public void showStatus() {
		System.out.println(name +" has "+attack+" attack power, "+ 
							movingSpeed+"km/h, and "+hp+"hp");
	}
	public String getName() {
		return name;
	}
	
	public void attack(LolCharacter counterpart) {
		counterpart.hp = - attack;
		System.out.println(name + " attack "+ counterpart.name + " with "+ attack+" att power");
		
	}
	public static void main(String[]args) {
		int[][] m = { {1,1,1,1},{1,2,3,4},{2,2,2,2},{2,4,6,8} };
			for(int r=0; r<m.length; r++) {
				
			}
		int sum = 0;
		for (int k = 0; k < m.length; k++) {
		    sum = sum + m[m.length-1-k][1];
		}
		System.out.println();
	}
}
