package Structure;

// this class have specified fields, method 'sentinel' for polymorphism 
// and method 'characterized' which uses our specified fields

public class Coupe extends Car {
	private double volume;
	private int quantity_of_doors;
	private int motor_power;

	public Coupe() {
	}

	public Coupe(String model, int day_production, double volume, int q_of_d, int m_p) throws InvalidDataException {
		super(model, day_production);
		this.volume = volume;
		this.quantity_of_doors = q_of_d;
		this.motor_power = m_p;
	}

	public void sentinel() {
		System.out.println("Output - " + this.getClass().getSimpleName());
	}

	public void charaterized() {
		System.out.println("Power of this car = " + (volume * motor_power));
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public int getQuantity_of_doors() {
		return quantity_of_doors;
	}

	public void setQuantity_of_doors(int quantity_of_doors) {
		this.quantity_of_doors = quantity_of_doors;
	}

	public int getMotor_power() {
		return motor_power;
	}

	public void setMotor_power(int motor_power) {
		this.motor_power = motor_power;
	}

}
