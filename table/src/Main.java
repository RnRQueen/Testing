public class Main {

    public static void print(int number) {
    int rows = number;
    int columns = 1;
        for(int i = 0; i < rows; i++) {

            for(int j = 0; j < columns; j++) {
                System.out.print(number + " ");
            }
            columns++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(5);
    }
}