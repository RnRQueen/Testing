public class Main {
    public static void main(String[] args) {
        Point a = new Point(5, 3);
        Point b = new Point(8, 7);
        Segment d = new Segment(a, b);
        System.out.printf("Длина отрезка до рассчета  = %f\n", d.segment);
        d.CalcSegment();
        System.out.printf("Длина отрезка = %f", d.segment);
    }

    }
