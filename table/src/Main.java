public class Main {

    public static void print(int number) {
        if (number > 9 || number < 0)
            throw new IllegalArgumentException("Input number from 0 to 9");
        int rows = number;
        int columns = number * 2;
        int mid = columns / 2;
        for (int i = 0; i < rows; i++) {
            int p = mid - i;
            for (int j = 0; j < columns; j++) {
                if (j > (mid + i))
                    break;
                if (j < p)
                    System.out.print(" ");
                else if (j >= p) {
                    System.out.print(number + " ");
                    j++;
                }
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        print(8);
    }
}