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
    
  
  }
}