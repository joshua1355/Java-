
public class Automobile {
	double gas; 
	double mpg;
	public Automobile(double miles) {
		gas = 0; 
		mpg = miles; 
	}
	public void fillUp(double gass) {
		gas+=gass;
	}
	public void takeTrip(double mile) {
		gas -= mile/mpg;
	}
	public double reportFuel() {
		return gas;
	}
}

