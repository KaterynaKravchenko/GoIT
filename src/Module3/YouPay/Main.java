package Module3.YouPay;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Blade", 1000, 10, "Plat", 500, "USD");
        System.out.println("User's balance = " + user1.getBalance());
        //test method companyNameLength
        System.out.println("The length of company " + user1.getCompanyName() + " is - " + user1.companyNameLegth(user1.getCompanyName()));

        user1.withdraw(200);//снимаю кеш 200 с комиссией 5%
        System.out.println("Balance after withdraw = " + user1.getBalance());

        user1.monthIncreaser(2);//добавляю месяцы сотрудничества
        System.out.println("All month of employment is - " + user1.getMonthOfEmployment());

        user1.paySalary();//выплата зп на баланс
        System.out.println("Total balance after salary = " + user1.getBalance());

        user1.withdraw(1100);
        System.out.println("Balance after withdraw = " + user1.getBalance());
    }
}
