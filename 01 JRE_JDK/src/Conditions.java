public class Conditions {
    public static void main(String[] args) {
        
        int age = 21;
        int people = 2;
        // boolean couple = true;
        boolean couple = people > 1;

        if (age >= 18 || people >= 2) {
            System.out.println("Allowed to get in");
        } else {
            System.out.println("Not allowed to get in");
        }

        if (age >= 18 && couple) {
            System.out.println("Allowed to get in");
        } else {
            System.out.println("Not allowed to get in");
        }
    }
}
