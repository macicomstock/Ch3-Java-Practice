import java.util.Scanner;

public class CH03PE32 {
/*This code asks the user for three integer values, then calculates the maximum of the three values and prints it.*/

   public static void main(String[] args) {
      //Your code goes here
      int number1 = 12;
      int number2 = 28;
      int number3 = 15;
      int tempMax = Math.max(number1, number2);
      int max = Math.max(tempMax, number3);
      System.out.println("The maximum integer is " + max);
   }
}
