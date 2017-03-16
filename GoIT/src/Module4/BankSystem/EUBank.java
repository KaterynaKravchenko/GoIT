package Module4.BankSystem;

public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if(getCurrency() == Currency.EUR) return 2200;
        else return 2000;//USD
    }

    @Override
    int getLimitOfFunding() {
        if(getCurrency() == Currency.EUR) return 20000;
        else return 10000;//USD
    }

    @Override
    int getMonthlyRate() {
        if(getCurrency() == Currency.EUR) return 1;//%
        else return 0;//% USD
    }

    @Override
    int getCommission(int summ) {
        int comission = 0;
        if(getCurrency() == Currency.EUR){
            if(summ < 1000) comission = 2;//%
            else comission = 4;//%
        } else
        if (getCurrency() == Currency.USD){
            if(summ < 1000) comission = 5;//%
            else comission = 7;//%
        }
        return  comission;
    }
}
