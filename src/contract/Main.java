package contract;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        HourlyContract hourlyContract = new HourlyContract("Почасов договор","15.2.2023",10,100,10);
        System.out.println("Почасовият договор Ви генерира - " + hourlyContract.calculatePayment() + " лв.");

        FixedTermContract fixedTermContract = new FixedTermContract("Срочен договор","08.08.2024", 1000,5);
        System.out.println("Срочният договор Ви генерира - " + fixedTermContract.calculatePayment() + " лв.");

        SalesContract salesContract= new SalesContract("Договор за посредничество ","14.02.2023",100000,3.5);
        System.out.println(salesContract.getName() + " Ви генерира - " + salesContract.calculatePayment() + " лв.");
        System.out.printf("%s Ви генерира - %.2f лв", salesContract.getName(), salesContract.calculatePayment());

        String dateVladi = "15/2/2023";
        String[] dateVladiSplitted = dateVladi.split("/");
        System.out.println(dateVladiSplitted[2]);


    }
}
