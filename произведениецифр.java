import java.util.*;
public class произведениецифр {
     public static void main(String[] args) {

       int number = 1762428997;
       int originalNumber = number;
       int countOfEvenDigit = 0;
      int mult = 1;
      int lastDigit = originalNumber% 10; //7
  
      while (number!= 0 ) {
         int n = number%10;
         if(n>7) {
          
          mult*=n;
         }
        number = number / 10;
       
      }
      System.out.printf("Произведение цифр больше 7 в числе %d равно  %d \n", originalNumber, mult);
   }
 }

