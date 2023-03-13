public class BonusControl {
    
    private double sum;

    public double registSalary(Functionary functionary) {
        this.sum += functionary.getBonus();
        System.out.println("Current Global Bonus: " + this.sum);
        return this.sum;
    }
}
