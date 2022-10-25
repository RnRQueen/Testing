import java.util.*;

public class фибоначчи {
    public static void main(String[] args) {

    int n = 15;
    int sum = 2;
    int n0 = 1;
    int n1 = 1;
    int next = 0;
    int k = 0;
    System.out.print(n0+" "+n1+" ");
  for(int i = 3; i <=15; i++){
			next = n0+n1;
			System.out.print(next +" ");
				
			n0=n1;
			n1=next;
			sum = n1+sum;
			
				if (i==6)
				
		{	
		 k = n1;
		}
		
  }
	System.out.println();
	System.out.printf("%d - это 6й член последовательности\n", k);	
	if (sum%2==0)
			{
			  System.out.printf("Сумма первых %d членов последовательности - четное число, она равна %d\n", n, sum);
			}
			else
      {			  System.out.printf("Сумма первых %d членов последовательности - нечетное число", n);
}

    }
    }
      
