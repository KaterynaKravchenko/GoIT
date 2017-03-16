package Class;

public class TestName {
    public static void main(String[] args) {
      int a = 3, b = 10;
        int result;
        //  '%'
        result = b%a;
        System.out.println(result);
        //  '/'
        result = b/a;
        System.out.println(result);
        //  '++'
        a += 10;
        System.out.println(a);
        //  '&&' 'if'
        boolean test = false;
        boolean test1 = true;
          if(test && test1) {
              System.out.println("inside if...");
          }
          else {
              System.out.println("inside else...");
          }
       //  'for' + 'break'
        boolean isActive = true;
        for(int i = 5; i < 10; i++){
            System.out.println("value " + i);
            if(isActive)
            break;
        }
        //  'for' + 'continue'
        isActive = false;
        for(int i = 5; i < 10; i++){
            System.out.println("value " + i);
            if(isActive)
                continue;
        }
        //  'while'
        int k = 10;
        while (k > 0){
            System.out.println(k);
            k=-4;
        }
        //  'do while'
        int c = 1;
        do {
            System.out.println("value is " + c);
            c++;
        } while (c <11);

        int balance = 120;
        if(balance > 100) {
            System.out.println("finish");
        }
        // i++   ++i
        int key = 10;
        key++;
        System.out.println(key);
        key = 10;
        key = k + 1;
        System.out.println(key);
        key = 10;
        ++key;
        System.out.println(key);

    }
}
