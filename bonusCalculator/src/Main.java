
public class Main {
    public static void main(String[] args) {
        print();
    }

    public static double bonusCalc(int salary) {
        double bonus = 0;
        if ((salary > 0) && (salary < 40000))
             bonus = salary * 0.5;
        if ((salary >= 40000) && (salary < 80000))
            bonus = salary * 0.7;
        if (salary>=80000)
            bonus = salary * 1.1;
        return bonus;
    }
    public static void print(){

        System.out.println("Премия сотрудника равна "+ bonusCalc(70000));
    }
}
