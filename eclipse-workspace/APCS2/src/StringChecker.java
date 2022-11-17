
public class StringChecker {
	public String lastChars(String a, String b) {

		if(a.length()==0){
			return "@";
		}else if(b.length()==0){
			return "@";
		}else{
			return a.substring(0,1)+b.substring(b.length()-1);
		}
		return a.substring(0,1)+b.substring(b.length()-1);
	}

	public String withoutX2(String str) {
		String withoutX= "";
		if (str.length() >2)
		{
			String firstX = str.substring(0,1);
			String secondX = str.substring(1,2);
			String lastX = str.substring(2);
			if(!firstX.equals("x"))
			{
				withoutX+=firstX;
			}
			if(!secondX.equals("x"))
			{
				withoutX+=secondX;
			}

			withoutX+=lastX;
		}
		else if (str.length()==1)
		{
			if (!str.substring(0,1).equals("x"))
			{
				withoutX+=str.substring(0,1);
			}
		}
		else if (str.length()==2)
		{
			if (!str.substring(0,1).equals("x"))
			{
				withoutX+=str.substring(0,1);
			}
			if (!str.substring(1,2).equals("x"))
			{
				withoutX+=str.substring(1);
			}
		}

		return withoutX;
	}

}

