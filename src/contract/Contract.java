package contract;

/*
Създайте абстрактен клас Contract, с 3 instance variables name, date, amount, гетъри и конструктор, който ги инициализира.
 Класът също така да има абстрактен метод calculatePayment(), който да се имплементира във всеки конкретен клас,
 който екстендва абстрактния.Създайте и 3 дъщерни класа - HourlyContract, FixedTermContract and SalesContract,
  като първият трябва да има две допълнителни поленца за изработените часове и за часовата ставка,
  съответно int и double. Имплементацията на calculatePayment() в този 1ви клас ще е тяхното произведение.
  При изработени 100 часа и часова ставка 10лв., методът ще връща 1000.Вторият клас ще има допълнително поле месеци,
  като имплементацията на calculatePayment() ще е равна на произведението между amount и месеците. При зададен amount 1000 и 5 месеца,
  ще връща 5000.И последния клас ще има поле за комисионната на посредника на сделката в проценти.
  За имплементацията на calculatePayment() ще се взима amount-a и комисионната. При amount 100 000 и комисионна 3.5, методът ще връща 3500.
 */

/*Създайте дъщерен клас Rent, с поле city, като методът ще връща доходност от 5%, ако въведеният от потребителя град е София и 7%,
ако не е София.Създайте дъщерен клас Loan, който ще връща доходност 10%, ако годината е 2022 и 7%, ако годината не е 2022.
 Тук е нужно от датата във формат 01/01/2023 да вземете само годината. Ползвайте масив и regex.*/

public abstract class Contract {
    private String name;
    private String date;
    private double amount;


    public Contract(String name, String date, double amount) {
        this.name = name;
        this.date = date;
        this.amount = amount;
    }


    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public abstract double calculatePayment();
}
