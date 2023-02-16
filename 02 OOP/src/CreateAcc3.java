public class CreateAcc3 {
    public static void main(String[] args) throws Exception {
        Account lyzasAccount = new Account(1);

        lyzasAccount.getHolder().setName("Lyza");
        lyzasAccount.getHolder().setDocument("123456789");
        lyzasAccount.getHolder().setPhone("+522222222222");
        
        lyzasAccount.setAgency(1);
        
        System.out.println(lyzasAccount.getHolder().getPhone());

        System.out.println(lyzasAccount.getHolder().getName());

        Account jamesAccount = new Account(54);

        jamesAccount.getHolder().setName("James");
        jamesAccount.getHolder().setDocument("987654321");
        jamesAccount.getHolder().setPhone("+533333333333");

        jamesAccount.deposit(1000);
        lyzasAccount.deposit(2000);

        jamesAccount.transfer(500, lyzasAccount);

        System.out.println(jamesAccount.getBalance());
        System.out.println(lyzasAccount.getBalance());

        jamesAccount.deposit(100);
        System.out.println(jamesAccount.getBalance());

        System.out.println(jamesAccount.getAgency());

        Account cartherAccount = new Account(54);
        cartherAccount.getHolder().setName("Carther");

        System.out.println("Total accounts created: " + Account.getAccounts());

        //A way to link account to client
        // lyzasAccount.setHolder(lyza);

        //Another way to link account to client
        // Account jamesAccount = new Account();
        // jamesAccount.holder = new Client();
        // jamesAccount.holder.setName("James");
    }
}
