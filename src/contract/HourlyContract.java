package contract;

public class HourlyContract extends Contract{
    private int workingHours;
    private double hourlyPayment;

    public HourlyContract(String name, String date, double amount, int workingHours, double hourlyPayment) {
        super(name, date, amount);
        this.workingHours = workingHours;
        this.hourlyPayment = hourlyPayment;
    }

    @Override
    public double calculatePayment() {
        return workingHours*hourlyPayment;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public void setHourlyPayment(double hourlyPayment) {
        this.hourlyPayment = hourlyPayment;
    }
}
