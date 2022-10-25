import java.util.*;

public class вклад {
    public static void main(String[] args) {
      
      double deposit = 1000;
      double percent = 0.02 ;
      double depositSum = 1200;
      double paymentSum = 30;
      double payment = 0;
      int MonthCounter = 0;
      int MonthPaymentResult = 0;
      int depositResult = 0;
      while (true)
      {
        if (payment>paymentSum && deposit>depositSum)
           break;
           MonthCounter++;
          if (payment <= paymentSum)
        {
          MonthPaymentResult = MonthCounter;
        }
          if (deposit<= depositSum)
        {
          depositResult = MonthCounter;
        }
        
        payment = deposit*percent;
        deposit +=payment;
     
        System.out.printf("%d %f %f\n", MonthCounter, deposit, payment);
      }
        
      System.out.printf("На %d месяц величина ежемесячного увеличения вклада превысит 30 рублей\n", MonthPaymentResult);
      System.out.printf("На %d месяц размер вклада превысит 1200 рублей\n", depositResult);

  }
}