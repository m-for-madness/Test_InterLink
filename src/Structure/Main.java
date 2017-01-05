package Structure;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
// there is polymorphism's example
public class Main {
	

	public static void main(String[] args) {
		try {
			
			Car car = new Car("Audi", 2010);
			Car car2 = new Car("Mercedes", 2001);
			// we are using type of the variable Car
			// but still can use method sentinel from extended clases
			Car autobus = new Autobus("Volvo", 2004, 40);
			Car autobus1 = new Autobus("Electron", 2016, 31);
			Car truck = new Truck("smt new", 2017, 15);
			Car coupe = new Coupe("Lamb", 2010, 3.3, 2, 600);
			//we can use methods from extended classes after type casting
			//((Coupe)coupe).charaterized();
			//we can compare objects by name of model,the day of production on default
			//or other fields after type casting 
			List<Car> cars = new LinkedList<Car>();
			cars.add(car);
			cars.add(car2);
			cars.add(autobus);
			cars.add(autobus1);
			cars.add(truck);
			cars.add(coupe);
			//input(cars);
			for (Car c : cars) {
				c.sentinel();
			}

		} catch (InvalidDataException | InvalidQuantityException e) {
			e.printStackTrace();
		}
	}
	// method for inputing new cars or autobuses
	public static void input(List<Car> c) throws InvalidDataException, InvalidQuantityException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to enter new objects? \n Yes - 1 \n No - 0");
		int choice = sc.nextInt();
		while (choice == 1) {
			System.out.println("If you want to input car - enter 1 \n Otherwise - 2");
			int k = sc.nextInt();
			if(k==1 || k==2){
			System.out.println("Input model");
			String model = sc.next();
			System.out.println("Input production date");
			int pd = sc.nextInt();
			if (k == 2) {
				System.out.println("Input quantity of passengers");
				int quantity = sc.nextInt();
				c.add(new Autobus(model, pd, quantity));

			} else 
				c.add(new Car(model, pd));
			} else
				System.out.println("You have entered incorrect number");
			
			System.out.println("Do you want to continue? Yes - 1 / No - 0");
			choice=sc.nextInt();
		}
	}
}
