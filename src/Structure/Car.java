package Structure;

// main class 
// there are getters and setters - incapsulation
//also Car implements interface Comparable for comparing two objects of type Car(or our extended classes) 
public class Car implements Comparable<Car> {
	protected String model;
	protected int day_production;

	public Car() {
		super();
	}

	public Car(String model, int day_production) throws InvalidDataException {
		super();
		this.model = model;
		if (day_production <= 1901) {
			throw new InvalidDataException();
		} else
			this.day_production = day_production;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getDay_production() {
		return day_production;
	}

	public void setDay_production(int day_production) throws InvalidDataException {
		if (day_production <= 1901) {
			throw new InvalidDataException();
		} else
			this.day_production = day_production;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", day_production=" + day_production + "]";
	}

	@Override
	public int compareTo(Car o) {
		int res = this.model.compareTo(o.model);
		if (res == 0) {
			res = this.day_production - o.day_production;
		}
		return res;
	}

}

class InvalidDataException extends Exception {
}
