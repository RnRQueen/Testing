import java.util.*;
public class Main {
     public static void main(String[] args) {

       int number = 1762422567;
       int originalNumber = number;
       int countOfEvenDigit = 0;
      int sum = 0;
      int lastDigit = originalNumber% 10; //7
  
      while (number!= 0 ) {
         int n = number%10;
         if(n>5) {
          
          sum+=n;
         }
        number = number / 10;
       
      }
      System.out.printf("Сумма цифр больше 5 в числе %d равна  %d \n", originalNumber, sum);
   }
 }

