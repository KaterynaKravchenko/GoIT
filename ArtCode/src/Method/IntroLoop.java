package Method;

public class IntroLoop {
    public static void main(String[] args) {
        /*
        int column = 0;
        int exit = 10;

        while(column<exit) {
            System.out.println(column + "do action");
            column++;
        }*/

        int start = 0;
        int stop = 10;
        int count = stop; // шаг

        while(count >= start) {
            System.out.println(count);
            count =  count - 2; // stop -= 2;
        }
        count = 1;

        while(count < stop && count % 2 != 0) {
            System.out.println(count);
            count += 2;
        }

        for(int j = 0; j < 10; j++){
            System.out.println(j);
        }
        // j++ - невозможно, так как j существует только внутри цикла for

        /*for(;;){
                 }while (true){}*/ // бесконечные циклы
    }
}
