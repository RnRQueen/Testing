import java.util.*;

public class Main {
    public static void main(String[] args)
    {
      System.out.println("Task 1");
    int  result = 6;
     switch(result) {
        
        case 0:
          System.out.println("Loose");
          break;
        case 3:
          System.out.println("Win");
          break;
        case 1:
          System.out.println("dead heat");
          break;
        default:
          System.out.println("Incorrect number of points!");
          break;
      }
      
    System.out.println("Task 2");
    
  double r =6.0;
  double S1= Math.PI*r*r;
  double a=13.0;
  double S2= a*a;
  if (S1>S2){
    System.out.println("Площадь круга больше площади квадрата");}
  else 
    {System.out.println("Площадь квадрата больше площади круга");}
    
  System.out.println("Task 3");
  
  int num = 88;
  int  dec = num/10;
  int units = num%10;
  int sum = dec+units;
  if (sum > 9 && sum <100)
   {System.out.println("Сумма цифр является двузначным числом");}
  else
    {System.out.println("Сумма цифр не является двузначным числом");}
  if (sum>num) 
   {System.out.println("Сумма цифр больше самого числа");}
  else
    {System.out.println("Сумма цифр не больше самого числа");}
 
 System.out.println("Task 4"); 
  
  int num1 = 15;
  int num2 = 13;
  if (Math.sqrt(num2) < num1)
  {
    num2 = num2*5;
    System.out.println("Число 2 увеличено в 5 раз");
    System.out.println(num2);
    
  }
  else 
  {System.out.println("Квадратный корень из второго числа не меньше первого числа");}
  
  
  System.out.println("Task 5");
  
  double a1, b, c;
  a1 = 0.66;
  b = 0.78;
  c = 0.50;
  boolean result1 = (a1<b)&&(b<c);
  System.out.println(result1);
  if (result1) 
  {System.out.println("Неравенство a1<b<c выполняется");}
  else 
  {System.out.println("Неравенство a1<b<c не выполняется");}
 
  boolean result2 = (b>a1)&&(a1>c);
  System.out.println(result2);
  if (result2) 
  {System.out.println("Неравенство b<a1<c выполняется");}
  else 
  {System.out.println("Неравенство b<a1<c не выполняется");}

  }
}