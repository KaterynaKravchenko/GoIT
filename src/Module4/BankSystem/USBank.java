package Module4.BankSystem;

public class USBank extends Bank{
    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if(getCurrency() == Currency.EUR) return 1200;
        else return 1000;
    }

    @Override
    int getLimitOfFunding() {
        if(getCurrency() == Currency.EUR) return 10000;
        else return -1;
    }

    @Override
    int getMonthlyRate() {
        if(getCurrency() == Currency.EUR) return 2;//%
        else return 1;//%
    }

    @Override
    int getCommission(int summ) {
        int comission = 0;
        if(getCurrency() == Currency.EUR){
            if(summ < 1000) comission = 6;//%
            else comission = 8;//%
        } else
            if (getCurrency() == Currency.USD){
            if(summ < 1000) comission = 5;//%
            else comission = 7;//%
        }
        return  comission;
    }
}
