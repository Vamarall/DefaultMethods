package program;

import java.util.Scanner;

import service.BrazilTaxService;
import service.TaxService;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Amount: ");
        double amount = sc.nextDouble();

        System.out.println("Months: ");
        int months = sc.nextInt();

        TaxService br = new BrazilTaxService(2.0);
        double Payment = br.interest(amount, months);

        System.out.println("Payment after " + months + " months");
        System.out.println(String.format("%.2f", Payment));

        sc.close();
    }
}
