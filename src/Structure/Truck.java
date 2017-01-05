package Structure;

//method 'sentinel' - polymorphism
public class Truck extends Autobus {
	// the second specified field in extended class
	private int tonnage;

	public Truck(String model, int day_production, int tonnage) throws InvalidDataException, InvalidQuantityException {
		super(model, day_production);
		this.tonnage = tonnage;
	}

	// specified method for this class
	public void incTonnage(int i) {
		tonnage += i;
	}

	public void sentinel() {
		System.out.println("Output the result of Truck's method - " + this.getClass().getSimpleName());
	}

	public int getTonnage() {
		return tonnage;
	}

	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}

	@Override
	public String toString() {
		return "Truck[model=" + model + ", day_production=" + day_production + ", tonnage=" + tonnage
				+ ", passenger's quantity =" + super.getPassengers_quantity() + "]";
	}

}
