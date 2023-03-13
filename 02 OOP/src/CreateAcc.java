public class CreateAcc {
    public static void main(String[] args) {

        //variable -> 2c7b84de Memory value
        Account first = new Account();
        first.balance = 1000;

        System.out.println(first.balance);

        Account same = first;
        System.out.println(first);
        //has the same memory location
        System.out.println(same);

        //Creating new memory location
        Account second = new Account();
        second.setBalance(500);

        System.out.println(second.getBalance());
    }
}
