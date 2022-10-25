import java.util.*;
public class Main {
     public static void main(String[] args) {

       int number = 1762457;
       int originalNumber = number;
       int countOfLastDigit = 0;

     int lastDigit = originalNumber% 10; //7
     System.out.println("последняя цифра "+lastDigit);
      while (number!= 0 ) {
       int n = number% 10;
         if(n == lastDigit) {
           countOfLastDigit++;
         }
        number = number / 10;
       
      }
      System.out.printf("Число %d содержит последнюю цифру %d раз\n", originalNumber, countOfLastDigit);
   }
 }

