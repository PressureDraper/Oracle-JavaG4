public class Admin extends Functionary implements Auth {

    private UtilAuth autenticador;
    private String password;

    public Admin () {
        this.autenticador = new UtilAuth();
    }

    @Override
    public double getBonus() {
        return super.getSalary() + (this.getSalary() * .05); //allows to access main class atributes
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
