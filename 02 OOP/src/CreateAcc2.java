public class CreateAcc2 {
    public static void main(String[] args) {

        Account person = new Account();
        person.setBalance(1000);
        Account person2 = new Account();
        person2.setBalance(1000);

        System.out.println(person.getBalance());

        person.withdraw(200);
        
        System.out.println(person.getBalance());

        if (person2.transfer(300, person)) {
            System.out.println("Transference success.");
        } else {
            System.out.println("There was an error during transference.");
        }

        System.out.println(person.getBalance());
        System.out.println(person2.getBalance());
    }
}
