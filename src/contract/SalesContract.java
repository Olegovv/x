package contract;

public class SalesContract extends Contract{
    private double commission;

    public SalesContract(String name, String date, double amount, double commission) {
        super(name, date, amount);
        this.commission = commission;
    }

    @Override
    public double calculatePayment() {
        double percents = this.commission/100;
        return getAmount()*percents;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
}
