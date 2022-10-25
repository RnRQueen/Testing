public class For {
    public static void main(String[] args) {
     System.out.println("task 1"); 
     
      int num = 15;
      for (int i = 0; i<10; i++)
      {System.out.println(num);}
      
    System.out.println("task 2");
    
     for(int i = 25; i <= 35 ; i++)
       { System.out.printf("%d %d.5 %d.8\n", i, i,i-1);
      }
      
    System.out.println("task 3");
    
    for (int i = 1; i<=10; i++)
    {double f = i*0.453;
      System.out.printf("%d фунтов = %f кг\n", i, f);}
      
    System.out.println("task 4");  
    double sum = 0;
    for (int i = 1; i<=88; i++)
    {      sum += 1./i;
     
    }
          System.out.println("Сумма гармонического ряда  = "+ sum);

  }
}