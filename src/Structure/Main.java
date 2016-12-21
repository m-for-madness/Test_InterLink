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

			Autobus autobus = new Autobus("Volvo", 2004, 40);
			Autobus autobus1 = new Autobus("Electron", 2016, 31);
			if(car.compareTo(autobus1)<0){
			System.out.println("!!");
			}
			List<Car> cars = new LinkedList<Car>();
			cars.add(car);
			cars.add(car2);
			cars.add(autobus);
			cars.add(autobus1);
			input(cars);
			// it's our example of polymorphism
			for (Car c : cars) {
				System.out.println(c);
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
