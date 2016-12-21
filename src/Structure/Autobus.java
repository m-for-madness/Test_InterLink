package Structure;

// extended class  - example of inheritance
public class Autobus extends Car {
	private int passengers_quantity;

	public Autobus(String model, int day_production, int passengers_quantity)
			throws InvalidDataException, InvalidQuantityException {
		super(model, day_production);
		if (passengers_quantity <= 0) {
			throw new InvalidQuantityException();
		} else
			this.passengers_quantity = passengers_quantity;
	}

	@Override
	public String toString() {
		return "Autobus[model=" + model + ", day_production=" + day_production + ", passengers_quantity="
				+ passengers_quantity + "]";
	}

	public int getPassengers_quantity() {
		return passengers_quantity;
	}

	public void setPassengers_quantity(int passengers_quantity) throws InvalidQuantityException {
		if (passengers_quantity <= 0) {
			throw new InvalidQuantityException();
		} else
			this.passengers_quantity = passengers_quantity;
	}

}

class InvalidQuantityException extends Exception {
}