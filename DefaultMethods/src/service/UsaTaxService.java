package service;

public class UsaTaxService implements TaxService {
    double interestRate;

    public UsaTaxService(double interestRate) {
        this.interestRate = interestRate;
    }

 
    @Override
    public double getInterstRate() {
       return interestRate;
    }

    

}
