public class Manager extends Functionary implements Auth {

    private UtilAuth autenticador;
    private String password;
    static private double totalBonus;

    public Manager () {
        this.autenticador = new UtilAuth();
    }

    public String getKey() {
        return password;
    }

    public void setKey(String password) {
        this.password = password;
    }

    @Override
    public double getBonus() {
        return super.getSalary() + (this.getSalary() * .05); //allows to access main class atributes
    }

    //Method Overloading
    public double getBonus(double totalBonus) {
        return Manager.totalBonus += totalBonus;
    }

    @Override
    public void setPassword(String password) {
        this.autenticador.setPassword(password);
    }

    @Override
    public boolean logIn(String password) {
        return this.autenticador.autenticar(password);
    }

}
