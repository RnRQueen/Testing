import java.util.*;
public class Main {
     public static void main(String[] args) {

       int number = 176242257;
       int originalNumber = number;
       int countOfEvenDigit = 0;

     int lastDigit = originalNumber% 10; //7
   
      while (number!= 0 ) {
       
         if(number%2==0) {
           countOfEvenDigit++;
         }
        number = number / 10;
       
      }
      System.out.printf("Число %d содержит  %d четных цифр\n", originalNumber, countOfEvenDigit);
   }
 }

