package Module4.BankSystem;

public class Main {
    static void allMethods(BankSystem bankSystemImpl, User user1, User user2, int withdrawal, int fund, int transfer){
        System.out.println(user1);
        bankSystemImpl.withdrawOfUser(user1, withdrawal);
        bankSystemImpl.fundUser(user1, fund);
        bankSystemImpl.transferMoney(user1, user2, transfer);
        bankSystemImpl.paySalary(user1);
        System.out.println(user1);
        System.out.println("____________________");
    }

    public static void main(String[] args) {
        Bank usBank = new USBank(12, "USA", Currency.USD, 1500, 1000, 10, 500000);
        Bank euBank = new EUBank(5, "Swizerland", Currency.EUR, 900, 2600, 7, 1000000);
        Bank chinaBank = new ChinaBank(22, "China", Currency.USD, 1500, 500, 54, 25000);

        User userUSBank1 = new User(100, "MIA", 1000.00, 6, "Paramount", 800, usBank);
        User userUSBank2 = new User(18, "Klint Eastwood", 800.00, 10, "Hollywood", 500, usBank);
        User userEUBank1 = new User(99, "Queen Elozavet", 555.50, 36, "United Kingdom", 1000, euBank);
        User userEUBank2 = new User(56, "Kateryna Kravchenko", 2600, 7, "Platinum Bank", 1300, euBank);
        User userChinaBank1 = new User(80, "Long Woo", 700.00, 12, "Samsung", 350, chinaBank);
        User userChinaBank2 = new User(76, "Kavasaki", 600.00, 8, "Y3", 400, chinaBank);

        BankSystem bankSystem = new BankSystemImpl();
        allMethods(bankSystem, userUSBank1, userUSBank2, 100, 200, 300);
        allMethods(bankSystem, userUSBank2, userUSBank1, 1200, 500, 500);
        allMethods(bankSystem, userEUBank1, userEUBank2, 150, 500, 350);
        allMethods(bankSystem,userEUBank2, userEUBank1, 100, 999, 150);
        allMethods(bankSystem, userChinaBank1, userChinaBank2, 75, 50, 100);
        allMethods(bankSystem, userChinaBank2, userChinaBank1, 15, 25, 55);
    }
}
