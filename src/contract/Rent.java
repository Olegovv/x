package contract;

public class Rent extends Contract {
    private String city;

    public Rent(String name, String date, double amount, String city) {
        super(name, date, amount);
        this.city = city;
    }

    @Override
    public double calculatePayment() {
        String cityCapital = "София";
        try {
            if (city.equals(cityCapital)) {
                double profitability = (getAmount() * 5 / 100);
                return getAmount() + profitability;
            } else {
                return getAmount() + (getAmount() * 7 / 100);
            }
        } catch (Exception e) {
            System.out.println("City is null, program continue.");
        }
        return 0;
    }
}
