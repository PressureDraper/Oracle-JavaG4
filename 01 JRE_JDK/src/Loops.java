public class Loops {
    public static void main(String[] args) {
        int cont = 0;
        int total = 0;

        while (cont <= 10) {
            total = total + cont;
            cont++;
        }

        System.out.println(total);

        for (cont = 1; cont <= 10; cont++) {
            System.out.println(cont);
        }
    }
}
