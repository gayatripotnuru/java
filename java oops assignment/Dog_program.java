package basic;
class Dog{
	String name;
	String breedName;
	Dog(String name,String breedName){
		this.name=name;
		this.breedName=breedName;
	}
	void displayinfo() {    System.out.println("Name: "+name+", BreedName: "+breedName);   }
	public String getName() {    return name;   }
	public void setName(String name) {      this.name = name;   	}
	public String getBreedName() {   return breedName;   }
	public void setBreedName(String breedName) {     this.breedName = breedName;   } }
public class Dog_program {
public static void main(String[] args) {
		// TODO Auto-generated method stub
    Dog d=new Dog("chintu","Golden Retriever");
    d.displayinfo();
   Dog d1 =new Dog("sumo","Siberian Husky");
    d1.displayinfo(); 
    System.out.println("updated breed info...");
    d1.setBreedName("German Shepherd");
    d1.displayinfo();
    
	}

}
