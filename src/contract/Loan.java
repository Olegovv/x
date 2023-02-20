package contract;

public class Loan extends Contract{
    private Loan(String name, String date, double amount) {
        super(name, date, amount);
    }

    @Override
    public double calculatePayment() {
        return 0;
    }
}
