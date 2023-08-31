import java.util.Scanner;
import java.util.Random;

public class randomnum {
  public static void main(String[] args) {
  	Scanner input = new Scanner(System.in);
  	Random gen = new Random();

  	System.out.println("\n\t\tRANDOM NUMBER GENERATION\nENTER LIMIT FOR RANDOM NUMBER : ");
  	int n = input.nextInt();
  	int num = gen.nextInt(n+1);

  	System.out.println("THE RANDOM NUMBER GENERATED BETWEEN (0 TO "+n+") IS : "+num);
  }
}