package Module4.BankSystem;

public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if(getCurrency() == Currency.EUR) return 150;
        else return 100;//USD
    }

    @Override
    int getLimitOfFunding() {
        if(getCurrency() == Currency.EUR) return 5000;
        else return 10000;//USD
    }

    @Override
    int getMonthlyRate() {
        if(getCurrency() == Currency.EUR) return 0;//%
        else return 1;//% USD
    }

    @Override
    int getCommission(int summ) {
        int comission = 0;
        if(getCurrency() == Currency.EUR){
            if(summ < 1000) comission = 10;//%
            else comission = 11;//%
        } else
        if (getCurrency() == Currency.USD){
            if(summ < 1000) comission = 3;//%
            else comission = 5;//%
        }
        return  comission;
    }
}
