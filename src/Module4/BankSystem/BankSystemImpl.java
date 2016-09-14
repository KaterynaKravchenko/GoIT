package Module4.BankSystem;

public class BankSystemImpl implements BankSystem{
    @Override
    public void withdrawOfUser(User user, int amount) {
    Bank userBank = user.getBank();
        int comission = userBank.getCommission(amount);//%
        if(userBank.getLimitOfWithdrawal() >= amount + amount * comission / 100){
            double newBalance = user.getBalance() - amount - amount * comission / 100;
            user.setBalance(newBalance);
            System.out.println("Операция снятия средств успешна! Ваш баланс: " + user.getBalance());
        } else System.out.println("Сумма снятия превышает допустимый лимит. Ваш лимит: " + userBank.getLimitOfWithdrawal());
    }

    @Override
    public void fundUser(User user, int amount) {
    Bank userBank = user. getBank();
        if (userBank.getLimitOfFunding() == -1 || userBank.getLimitOfFunding() >= amount){
            double newBalance = user.getBalance() + amount;
            user.setBalance(newBalance);
            System.out.println("Успешное пополнение счета! Ваш баланс: " + user.getBalance());
        } else System.out.println("Превышен лимит на пополннеие счета. Ваш лимит: " + userBank.getLimitOfWithdrawal());
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
    //Bank bankFromUser = fromUser.getBank();
    //Bank bankToUser = toUser.getBank();
        double oldBalance = fromUser.getBalance();
        withdrawOfUser(fromUser, amount);
        if(oldBalance != fromUser.getBalance()) fundUser(toUser,amount);
        else System.out.println("Перевод отклонен!");
        /**int comission = bankFromUser.getCommission(amount);
        if(bankFromUser.getLimitOfWithdrawal() >= amount + amount * comission / 100){
            double newBalance = fromUser.getBalance() - amount - amount * comission / 100;
            fromUser.setBalance(newBalance);
            System.out.println("Операция перевода средств успешна! Баланс " + fromUser.getName() + " составляет " + fromUser.getBalance());
        } else System.out.println("Перевод отклонен! Сумма снятия превышает допустимый лимит.");

    if(oldBalance != fromUser.getBalance()) {
        if (bankToUser.getLimitOfFunding() == -1 || bankToUser.getLimitOfFunding() >= amount) {
            double newBalance = toUser.getBalance() + amount;
            toUser.setBalance(newBalance);
            System.out.println("Вам переведены средства от " + fromUser.getName() + ". Ваш баланс: " + toUser.getBalance());
        } else System.out.println("Перевод отклонен! Превышен лимит пополнения средств!");
    } else System.out.println("Перевод отклонен!");*/
    }

    @Override
    public void paySalary(User user) {
    Bank userBank = user.getBank();
        int comission = userBank.getCommission(user.getSalary());
        double newBalance = user.getBalance() + user.getBalance() - user.getSalary() * comission / 100;
        user.setBalance(newBalance);
        System.out.println("На счет пришла зарплата. Ваш баланс: " + user.getBalance());

    }
}
