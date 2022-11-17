
public class PasswordGen {
	public static void main(String[] args) {
		String result = makePassword(8);
		System.out.println(result);
	}
	public static String makePassword(int length) {
		String password = "";
		
		for (int i = 0; i < length-2; i++);
			password = password + randomChar("abcdefghiklmopkrstuvwxyz");
	}
	private static String randomChar(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	String randomDigit = randomCharacter("0123456789");
	password = insertAtRandom(Math.random);
}
	public static String randomCharacter(String character) {
		int n = character.length();
		int r = (int)(n*Math.random());
		return characters.substring(r,r+1);
	}
}
