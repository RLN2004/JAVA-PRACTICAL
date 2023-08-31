import java.util.*;

public class calendarinjava {
  public static void main(String[] args) {
  	
    Calendar cal = Calendar.getInstance();

//USING CAL OBJ TO GET DATE,MONTH,YEAR
    int month = cal.get(Calendar.MONTH)+1;  //CALENDER CLASS HAS A ZERO INDEX FOR MONTH(JAN=0) SO ADDING 1 WILL NORMALIZE THE DATE
    int day = cal.get(Calendar.DATE);
    int year = cal.get(Calendar.YEAR);

//TO PRINT CURRENT DATE(D-M-Y)
  	System.out.println("CURRENT DATE : "+day+"/"+month+"/"+year);
  }
}
 