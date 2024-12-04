package gayatri;
class Person{
	String name;
	int age;
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	void displayInfo() {
		System.out.println("personName: "+name+" , personAge: "+age);
	}
}
public class DetailsOfPerson {
public static void main(String[] args) {
		// TODO Auto-generated method stub
      Person p1=new Person("Gayatri",22);
      p1.displayInfo();
      Person p2=new Person("Ram",23);
      p2.displayInfo();
	}

}
