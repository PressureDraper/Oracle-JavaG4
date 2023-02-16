public class IR {

    public static void main(String[] args) {

        // 1900.0 ~ 2800.0 IR from 7.5% deduct $ 142
        // 2800.01 ~ 3751.0 IR from 15% deduct $ 350
        // 3751.01 ~ 4664.00 IR from 22.5% deduct $ 636

        double salary = 3300.0;

        if (salary >= 1900.0 && salary <= 2800.0) {
            System.out.println("Rate percent: " + "7.5%");
            System.out.println("$142 can be deducted");
        } else if (salary >= 2800.01 && salary <= 3751.0) {
            System.out.println("Rate percent: " + "15%");
            System.out.println("$350 can be deducted");
        } else if (salary >= 3751.01 && salary <= 4664.00) {
            System.out.println("Rate percent: " + "22.5%");
            System.out.println("$636 can be deducted");
        }

    }
}
