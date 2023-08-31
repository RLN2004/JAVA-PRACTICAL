//CLASS HUMAN 
class human{
	String name;
	int age;

//CONSTRUCTOR FOR HUMAN CLASS
	human(String n,int a){
		name=n;
		age=a;
	}

//A METHOD TO PRINT NAME AND AGE OF THE OBJECT
	void tellnameandage(){
		System.out.println("MY NAME IS "+name+" AND MY AGE IS "+age);
	}
}

public class ClassandObject {
  public static void main(String[] args) {
  	
//CREATING OBJECT WITH HUMAN CLASS
  	human adam = new human("adam",6969);
  	human eve = new human("eve",4328);

//INVOKING THE TELLNAMEANDAGE METHODS WITH OBJECTS(ADAM,EVE)
  	adam.tellnameandage();
  	eve.tellnameandage();

  }
}