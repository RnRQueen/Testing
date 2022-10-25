import java.util.*;
import java.util.Scanner;

public class суммацифр {
    public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc. nextInt();
      int sum = 0;
      if (a>b)
      {
        System.out.println("Введены числа, не соответствующие условию a<=b");
      }
      
      else 
        {
         for (int i = a; i<= b; i++)
          {
           sum = sum+i;
          }
        System.out.printf("Сумма чисел от %d до %d равна %d\n", a, b, sum );
        }
  }
}