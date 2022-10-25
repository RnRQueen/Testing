import java.util.*;

public class кругквадрат {
    public static void main(String[] args) {
      double Sc = 10;
      double Ss = 20;
  double pi = Math.PI;

      double diametr = 2*(Math.sqrt(Sc/pi));
      System.out.println("Диаметр круга равен "+diametr);
     
     double diagonal = Math.sqrt(2*Ss);
      System.out.println("Диагональ квадрата равна "+diagonal);
      
      double a = Math.sqrt(Ss);
      System.out.println("Сторона квадрата равна "+a);
      
      if (a>=diametr)
      { System.out.println("Круг поместится в квадрате ");}
        else 
        { System.out.println("Круг не поместится в квадрате ");}
      
     if (diagonal <= diametr)
    { System.out.println("Квадрат поместится в круге");}
    else 
    {System.out.println("Квадрат не поместится в круге");}
    
    
  }
}