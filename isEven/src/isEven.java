

public class isEven {
    public static boolean isEven(int num)
    {if ((num>0)&&(num%2==0))
        return true;
            else
        return false;
    }
    public static void print(){
        int num = 5;
        isEven(num);
        if (isEven(num) == true)
        System.out.println("Число четное");
        else
        System.out.println("Число нечетное");
    }
    public static void main(String[] args) {
        print();

    }
}