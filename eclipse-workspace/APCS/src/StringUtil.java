
public class StringUtil {
	public static String apcsReplaceAll(String str, String oldStr, String newStr) {
		String a = "";
		while()
		a+=str.substring(0,oldStr.length())+ newStr + str.substring(newStr.length(),str.length());
		return a;
	}
			
	public static void main(String[] args) {
		StringUtil a1 = new StringUtil();
		a1.apcsReplaceAll("To good", "to", "2");
		System.out.println(a1);
		
	}
}
