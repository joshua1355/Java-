
public class MegaCafe {
	String coffeeName;
	int calorie,beans;

	public MegaCafe(String latte, int cal, int bean) {
		coffeeName = latte;
		calorie = cal;
		beans = bean;
		
	}
	public void showInfo (MegaCafe stat) {
		String infos = "Coffee name : "+ coffeeName + "\ncalorie : " + calorie + "\nnumber of beans : " + beans;
		System.out.println(infos);
	}

}
