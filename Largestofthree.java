import java.util.Scanner;

public class Largestofthree {
  public static void main(String[] args) {
  	Scanner input = new Scanner(System.in);

  	System.out.println("\n\t\tLARGEST OF 3 NUMBERS\nENTER THE THREE NUMBERS : ");
  	int a = input.nextInt();
  	int b = input.nextInt();
  	int c = input.nextInt();

  	if((a>b)&&(a>c)){
  		System.out.println(a+" IS THE LARGEST");
  	}
  	else if((b>a)&&(b>c)){
  		System.out.println(b+" IS THE LARGEST");
  	}
  	else{
  		System.out.println(c+"IS THE LARGEST");
  	}
  }
}