package basic;
class TrafficLight {
	String color;
    int duration;
    void setDuration(int d) {
        this.duration = d;
    }
   void changeColor(String c) {
        this.color = c.toLowerCase();
    }
 void isRed() {
        if (color.equals("red")) {
            System.out.println("The light is red.");
        } else {
            System.out.println("The light is not red.");
        }
    }
void isGreen() {
        if (color.equals("green")) {
            System.out.println("The light is green.");
        } else {
            System.out.println("The light is not green.");
        }
    }
void getDuration() {
        System.out.println("Duration: " + this.duration + " seconds");
    }
}
public class Traffic_Program {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		  TrafficLight ob1 = new TrafficLight();
	        ob1.changeColor("red");
	        ob1.setDuration(30);
            ob1.isRed();
            ob1.changeColor("green");
            ob1.isGreen();
            ob1.getDuration();
            ob1.setDuration(40);
            ob1.getDuration();
	}

}
