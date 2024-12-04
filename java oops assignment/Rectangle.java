package gayatri;
 class shapeofRectangle{
	int length;
	int width;
	int areaOfRectangle;
	int perimeterOfRectangle;
	shapeofRectangle(int length,int width){
		this.length=length;
		this.width=width;
		this.areaOfRectangle=length*width;   //area of rectangle formula
		this.perimeterOfRectangle=2*(length+width);   //perimeter of rectangle formula
	}
	 void displayInfo() {
	        System.out.println("Area of rectangle: " + areaOfRectangle);
	        System.out.println("Perimeter of rectangle: " + perimeterOfRectangle);
	    }}
public class Rectangle {
public static void main(String[] args) {
		shapeofRectangle sr1=new shapeofRectangle(12,14);
		sr1.displayInfo();
		}
	}
