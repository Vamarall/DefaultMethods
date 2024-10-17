package service;
import java.security.InvalidParameterException;

public interface TaxService {

    double getInterstRate();

   default double interest(double amount, int months){

    if(months < 1){
        throw new InvalidParameterException("Months must be greater than 0");
    }

    return amount * Math.pow(1.0 + getInterstRate() / 100.0, months);
    
   
   }
    
}
