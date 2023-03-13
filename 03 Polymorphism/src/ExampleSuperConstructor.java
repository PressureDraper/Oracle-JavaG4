public class ExampleSuperConstructor extends Account {

    public ExampleSuperConstructor(double balance, int agency) throws Exception {
        super(balance, agency);
    }

    @Override
    public boolean withdraw(double balance) {
        double com = 0.2;
        return super.withdraw(balance + com);
    }
    
}
