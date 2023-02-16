public class Vars {
    public static void main(String[] args) {
        int age = 28;
        double salary = 1250.99D;
        double halfSy = salary / 2;
        float fnum = 2.5F;
        int syInt = (int) salary;
        long lnum = 1222222222222222222L;
        short snum = 13555;
        byte bt = 122;
        char ch = 'a';
        String a = "Alura team";

        System.out.print("Someone's age: " + age +"\n");
        System.out.print("Someone's half salarys: " + halfSy +"\n");
        System.out.print("Casting double to int: " + syInt +"\n");
        System.out.print("Float number: " + fnum +"\n");
        System.out.print("Long number: " + lnum +"\n");
        System.out.print("Short number: " + snum +"\n");
        System.out.print("Byte var: " + bt +"\n");
        System.out.print("Char var: " + ch +"\n");

        //unicode - ASCII representation
        ch = 65;
        System.out.print("Char var: " + ch +"\n");

        ch = 65 + 1;
        System.out.print("Char var: " + ch +"\n");

        //casting int sum to char
        System.out.print("Char var: " + (char) (ch + 1) +"\n");

        System.out.print("String var: " + a +"\n");

        //concatenate word to string
        System.out.print("String var: " + a + " 2023" +"\n");
    }
}
