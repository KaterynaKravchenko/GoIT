package Module3.YouPay;
/*
Create User class with the following fields:
String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency.
Create getters and setters and constructor with all fileds.
 */
public class User {
    private String name;
    private int balance;
    private int monthOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, int balance, int monthOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthOfEmployment = monthOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public String getName() { return name; }
    public int getBalance() { return balance; }
    public int getMonthOfEmployment() { return monthOfEmployment; }
    public String getCompanyName() { return companyName; }
    public int getSalary() { return salary; }
    public String getCurrency() { return currency; }

    public void setName(String name) { this.name = name; }
    public void setBalance(int balance) { this.balance = balance; }
    public void setMonthOfEmployment(int monthOfEmployment) { this.monthOfEmployment = monthOfEmployment; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }
    public void setSalary(int salary) { this.salary = salary; }
    public void setCurrency(String currency) { this.currency = currency; }
/*
Write methods:
void paySalary() - that add salary to the balance of the user
withdraw(int summ) - takes money from the balance with 5% commision if summ < 1000 and 10% commision in other cases
companyNameLenfht - calculates name of the company name
monthIncreaser(int addMonth) - increase monthsOfEmployment by addMonth
*/

    void paySalary(){
        this.balance = this.balance + this.salary;
    }

    void withdraw(int summ){
        int comission5 = 5, comission10 = 10;
        if(summ < 1000){ this.balance = this.balance - summ - summ * comission5 / 100; }
        else  this.balance = this.balance - summ - summ * comission10 / 100;
    }

    int companyNameLegth(String companyName){
        return companyName.length();
    }

    void monthIncreaser(int addMonth){ this.monthOfEmployment = this.monthOfEmployment + addMonth; }
}
