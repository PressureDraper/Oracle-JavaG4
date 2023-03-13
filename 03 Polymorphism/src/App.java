public class App {
    public static void main(String[] args) throws Exception {
        Functionary diego = new Accountant();

        diego.setName("Diego");
        diego.setDocument("4440767");
        diego.setSalary(2000);

        System.out.println(diego.getBonus());

        Manager manager = new Manager();

        manager.setName("Sarah");
        manager.setDocument("4440963");
        manager.setSalary(6000);

        System.out.println("Manager Bonus Update: " + manager.getBonus(manager.getBonus()));

        manager.setKey("pa$$w0rd");

        System.out.println(manager.getBonus());
        System.out.println(manager.logIn("pa$$w0rd")); //true - false

        BonusControl bonusControl = new BonusControl();

        bonusControl.registSalary(diego);
        bonusControl.registSalary(manager);

        Manager george = new Manager();
        george.setSalary(4000);
        System.out.println("Manager Bonus Update: " + george.getBonus(george.getBonus()));

        bonusControl.registSalary(george);

        Accountant sandra = new Accountant();
        sandra.setSalary(3000);

        System.out.println(sandra.getBonus());
        System.out.println("Accountant Bonus Update: " + sandra.getBonus(sandra.getBonus()));

        bonusControl.registSalary(sandra);

        ExampleSuperConstructor one = new ExampleSuperConstructor(2000, 1);
        Account two = new Account(0, 2);

        one.transfer(1000, two);
        System.out.println(one.getBalance());

        Manager g = new Manager();
        g.setKey("pa$$w0rd");

        InternalSys si = new InternalSys();
        si.autenticar(g);

    }
}
