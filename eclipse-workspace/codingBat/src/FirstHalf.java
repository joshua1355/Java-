
public class FirstHalf {
	public int countHi(String str) {
		  int a =0;
		  for(int i=0; i <str.length()-1; i++){
		    if(str.substring(i,i+2).equals("hi")){
		      a++;
		    }
		  }
		  return a;
		}
	public static void main(String[] args) {
		String sdk = "HelloApple";
		  String a = sdk.substring(0,sdk.length()/2);
		System.out.println(sdk.length()/2);
		FirstHalf a1= new FirstHalf();
		a1.countHi("HixxxxHixxxxhi");
		System.out.println(sdk.matches("HelloApple"));
		
	}
}
