public class InternalSys {

    private String contraseña = "pa$$w0rd";

    public void autenticar(Auth user) {

        boolean autentico = user.logIn(this.contraseña);

        if (autentico) {
            System.out.println("Puede entrar al sistema");
        } else {
            System.out.println("No puede entrar al sistema");
        }
    }
}
