public class Accountant extends Functionary {

    static private double totalBonus;

    @Override
    public double getBonus() {
        return 200;
    }

    //Method Overloading
    public double getBonus(double totalBonus) {
        return Accountant.totalBonus += totalBonus;
    }
    
}
