package Module2;

/*Домашнее задание №2.2
        Continue with BANK example
        Write method which withdraws money from account and takes commision 5% of the transaction.
        Print OK + commision + balance after withdrawal. Print NO is withdrawal is not possible.

        You need to write method which withdraw money of particular account owner if he/she can.
        Print name + NO of withdrawal fs not possible and name + sum of withdrawal + balance after
        withdrawal in other case. Commision is 5% for all cases.

Example
Input
int[] balances = {1200, 250, 2000, 500, 3200};
String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
String ownerName = Ann
double withdrawal = 100;
Output
Ann 100 145

Input
int[] balances = {1200, 250, 2000, 500, 3200};
String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
String ownerName = Oww
double withdrawal = 490;
Output
Oww NO
*/

public class BankSystem {
    public static double COMMISION = 0.05;
    public static double[] BALANCES = {1200, 250, 2000, 500, 3200};
    public static String[] OWNERNAMES = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    static double withdrawBalance(double balance, double withdrawal){
        double result = 0.00;
        return balance - withdrawal - (withdrawal * COMMISION);
    }
    static double withdrawBalance1(String ownerName, double withdrawal) {
        int item = 0;
        for(int i = 0; i < OWNERNAMES.length; i++){
            if(OWNERNAMES[i].equals(ownerName)) item = i;
        }
        return withdrawBalance(BALANCES[item], withdrawal);
    }
    static double fundBalance(String ownerName, double fund) {
        int item = 0;
        for(int i = 0; i < OWNERNAMES.length; i++){
            if(OWNERNAMES[i].equals(ownerName)) item = i;
        }
        return BALANCES[item] + fund;
    }

    public static void main(String[] args) {
       double balance = 1000;
       double withdrawal = 150;
       String ownerName = "Ann";

       if(((withdrawal * COMMISION) + withdrawal) < balance){
           double balanceOper = withdrawBalance(balance, withdrawal);
           System.out.println("OK; " + "The comission is " + (withdrawal * COMMISION) + "; Balance after - " + balanceOper);
       }
        else System.out.println("NO");

        double balancesOwner = withdrawBalance1(ownerName, withdrawal);
        if(balancesOwner >= 0){
            System.out.println(ownerName + "; Withdrawal is " + withdrawal + "; Balance after -  " + balancesOwner);
        }
        else System.out.println(ownerName + "; NO");

        System.out.println("Fund for " + ownerName + "; Balance after - " + fundBalance(ownerName, withdrawal));

    }
}
