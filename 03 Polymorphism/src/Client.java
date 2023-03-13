public class Client implements Auth {

    private UtilAuth autenticador;
    private String password;

    public Client () {
        this.autenticador = new UtilAuth();
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
