package Structure;

// extended class  - example of inheritance
public class Autobus extends Car {
	// there already was one specified field
	private int passengers_quantity;

	// constructor with all fields
	public Autobus(String model, int day_production ,int passengers_quantity) throws InvalidDataException, InvalidQuantityException {
		super(model,day_production);
		if(passengers_quantity<=0){
			throw new InvalidQuantityException();
		}
		else
		this.passengers_quantity = passengers_quantity;
	}
	//constructor with two fields for class Truck
	public Autobus(String model, int day_production) throws InvalidDataException {
		super(model,day_production);
		passengers_quantity = 2;
	}
	// it is our method for polymorphism
	public void sentinel(){
		System.out.println("Output the result of Autobus' method - "+ this.getClass().getSimpleName());
	}
	//specified method for this class
	public void incPas_quan(int i ){
		passengers_quantity+=i;
	}
	@Override
	public String toString() {
		return "Autobus[model=" + model + ", day_production=" + day_production + ", passengers_quantity=" +passengers_quantity + "]";
	}

	public int getPassengers_quantity() {
		return passengers_quantity;
	}

	public void setPassengers_quantity(int passengers_quantity) throws InvalidQuantityException {
		if(passengers_quantity<=0){
			throw new InvalidQuantityException();
		}
		else
		this.passengers_quantity = passengers_quantity;
	}
	
	
}
class InvalidQuantityException extends Exception{};