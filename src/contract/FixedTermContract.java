package contract;

public class FixedTermContract extends Contract {
    private int months;

    public FixedTermContract(String name, String date, double amount, int months) {
        super(name, date, amount);
        this.months = months;
    }
    @Override
    public double calculatePayment() {
        return getAmount()*months;
    }

    public void setMonths(int months) {
        this.months = months;
    }
}
