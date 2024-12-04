package basic;
import java.time.LocalTime;
class Airplane1 {
    long flightNum;
    String destination;
    LocalTime departureTime;
    Airplane1(long flightNum, String destination, int hour, int minute) {
        this.flightNum = flightNum;
        this.destination = destination;
        this.departureTime = LocalTime.of(hour, minute);     }
    void display() {
        System.out.println("Flight Number: " + flightNum + ", Destination: " + 
                                                                     destination + ", Departure Time: " + departureTime);}
 void checkFlightStatus() {
        LocalTime currentTime = LocalTime.now();
        if (departureTime.equals(currentTime)) {
            System.out.println("The flight is on time!");
        } else if (departureTime.isAfter(currentTime)) {
            System.out.println("The flight is delayed by " + java.time.Duration.between(currentTime, departureTime).toMinutes() + " minutes.");
        } else {
            System.out.println("The flight is early by " + java.time.Duration.between(departureTime, currentTime).toMinutes() + " minutes.");
        }
    }
}

public class Airplane {
    public static void main(String[] args) {
        Airplane1 ar = new Airplane1(8920L, "Paris", 9, 30); // Example: 15:30
        ar.display();
        ar.checkFlightStatus();
    }
}
 /*class Airplane1 {

	long flightNum;
	String destination;
	int departureTime;
	Airplane1(long flightNum, String destination,int departureTime){
		 this.flightNum=flightNum;
		 this.destination=destination;
		 this.departureTime=departureTime;
	 }
	void display() {
		System.out.println(flightNum+" "+destination+" "+departureTime+" ");
	}
	void CheckFlightStatus() {
		 int CurrentdepartureTime=8;
		if (departureTime==CurrentdepartureTime) {
			System.out.println("flight is on time!.....");
		}
		else if(CurrentdepartureTime<departureTime) {
			System.out.println("flight is delayed by"+(CurrentdepartureTime-departureTime));
		}
		else if(CurrentdepartureTime>departureTime) {
			System.out.println("flight is early");
		}
	}
	}
 public class  Airplane{
	public static void main(String [] args) {
		Airplane1 ar=new Airplane1(8920l,"paris",9);
		ar.display();
		ar.CheckFlightStatus();
	}

}*/

