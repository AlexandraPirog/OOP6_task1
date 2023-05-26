package Emploee;

public class EmploeeCountSalary {
    private int baseSalary;

    public EmploeeCountSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }
    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25);//calculate in otherway
        return baseSalary - tax;
    }
}
