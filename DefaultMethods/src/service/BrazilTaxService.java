package service;
public class BrazilTaxService implements TaxService {

    double interestRate;

    public BrazilTaxService(double interestRate) {
        this.interestRate = interestRate;
    }



    @Override
    public double getInterstRate() {
        return interestRate;
    }

}
