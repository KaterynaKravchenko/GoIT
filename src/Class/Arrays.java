package Class;

public class Arrays {
    static int calculateBalanceSum(int[] balances){
       int sum = 0;
        for(int balance: balances){
           sum += balance;
       }
      return sum;
    }

    public static void main(String[] args) {
        int[] myArr1 = new int[3];
        for(int i = 0; i < myArr1.length; i++){
            myArr1[i] = (int)Math.random();
            System.out.println(myArr1[i]);
        }

        int[] myArr2 = {1, 2, 3, 4, 5};
        System.out.println(myArr2[3]);
        System.out.println(myArr2.length);

        int[] balances = {2333, 5000, 6590, 6431, 10999, 4310};
        int sum = calculateBalanceSum(balances);
        int[] balances1 = {1333, 4000, 590, 8431, 1999, 3310};
        int sum1 = calculateBalanceSum(balances1);

        System.out.println("method 1  sum is " + sum);
        System.out.println("method 1  sum1 is " + sum1);

        int summ = 0;
        boolean isBankActive = true;
        for(int balance: balances){
            if(balance > 5000 && balance < 7000 || balance == 5000 && isBankActive){
                System.out.println("E-mail was send " + balance);
            }
            if(balance > 2000 && balance <4000){
                summ += balance;
            }
        }
        System.out.println("indian code sum is " + summ);


    }
}
