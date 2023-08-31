import java.util.Scanner;

public class Intrestcalculator {

	public static void simpleintrest(){

		Scanner input = new Scanner(System.in);
		
		System.out.println("\nENTER THE PRINCIPLE AMOUNT : ");
		int principle = input.nextInt();

		System.out.println("\nENTER THE RATE OF INTREST : ");
		double rate = input.nextInt();

		System.out.println("\nENTER THE DURATION(IN YEARS) : ");
		int time = input.nextInt();

		double intrest = (principle*rate*time)/100;

		System.out.println("THE SIMPLE INTREST FOR $"+principle+" WITH "+rate+"% INTREST FOR "+time+" YEAR IS : "+intrest);

	}

	public static void compoundintrest(){

		Scanner input = new Scanner(System.in);
		
		System.out.println("\nENTER THE PRINCIPLE AMOUNT : ");
		int principle = input.nextInt();

		System.out.println("\nENTER THE RATE OF INTREST : ");
		double rate = input.nextInt();

		System.out.println("\nENTER THE DURATION(IN YEARS) : ");
		int time = input.nextInt();

		System.out.println("\nENTER THE TIMES INTREST IS COMPOUNDED : ");
		int compound = input.nextInt();

		double intrest = principle*(Math.pow((1+rate/100),(time*compound)))-principle;

		System.out.println("THE COMPOUND INTREST FOR $"+principle+" WITH "+rate+"% INTREST FOR "+time+" YEAR AND "+compound+" COMPOUND IS : "+intrest);

	}

  public static void main(String[] args) {

  	Scanner input = new Scanner(System.in);
  	int con=1;

  	while(con==1){

  		System.out.println("\n\t\tINTREST CALCULATOR\n1.SIMPLE INTREST\n2.COMPOUND INTREST\n3.EXIT\nENTER YOUR CHOICE : ");
  		int choice = input.nextInt();
  		if(choice==1){
  			simpleintrest();
  		}
  		else if(choice==2){
  			compoundintrest();
  		}
  		else if(choice==3){
  			con=0;
  		}
  		else{
  			System.out.println("!..INVALID CHOICE..!");
  		}
  	}
  }
}