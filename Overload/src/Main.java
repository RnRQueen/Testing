public class Main{
public static void main(String[] args) {
   overloadFunction(2.0,5.0); //double
   overloadFunction(2, 3); //int
    overloadFunction(2.0f,8.0f);  //float
    }

public static double overloadFunction(double n, double m) {
    double result = Math.pow(n, m);
    System.out.println("Parameters are double, result = "+ result);
    return result;
}

public static double overloadFunction(int n, int m) {

        double result = Math.pow(n, m);
    System.out.println("Parameters are integer, result = "+ result);
        return result;
        }

public static double overloadFunction(float n, float m) {
        double result = Math.pow(n, m);
    System.out.println("Parameters are float, result = "+ result);
        return result;
        }

}