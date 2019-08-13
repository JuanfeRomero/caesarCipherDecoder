public class Main {

    public static void main(String[] args) {
        printSquareStar(7);
    }
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            System.exit(0);
        } else {
            int columns = number;
            int rows = number;
            for (int i = 0; i < rows; i++) {//each row
                for (int j = 0; j < columns; j++) {//each column
                    if (i == 0 || i == (number - 1) || j == 0 || j == (number - 1)) {
                        System.out.print("*");
                    } else if (i == j) {
                        System.out.print("*");
                    } else if (j == (rows - (i + 1))) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
    }
