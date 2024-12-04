package basic;
class vehicle {
	void drive() {
		System.out.println("Driving a car...");
	}
}
class car extends vehicle {
@Override
	void drive() {
		// TODO Auto-generated method stub
		System.out.println("Repairing a car...");
	}
}
public class Vehicle_Program {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c1 = new car();
		c1.drive();
	}

}
