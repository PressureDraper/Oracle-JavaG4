public class Matrix {
    public static void main(String[] args) {
        for (int row = 1; row <= 10; row++) {
            for (int column = 1; column <= 10; column++) {

                if (column > row) {
                    break;
                }

                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
