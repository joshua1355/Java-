public class canWaterPlants {

	public static void main(String[] args) {
		boolean isMoist = false;
		System.out.println("Need to water plants:"+ water(10,isMoist));
		
		
	}
	public static boolean water(int daysWatered, boolean isMoist) {
		return (!isMoist && daysWatered >=10);
	}
	
}
