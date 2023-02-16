public class Multiply {
    public static void main(String[] args) {
        int cont = 0;

        for (cont = 0; cont <= 10; cont++) {
            for (int i = 0; i <= 10; i++) {
                System.out.println(cont + " * " + i + " = " + cont*i);
            }
            System.out.println(" ");
        }
    }
}
