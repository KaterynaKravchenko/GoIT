package Method;

public class ScopeVariable {
    public static void main(String[] args) {
      int main = 0;

        if(true){
            int c = 34;
        }
        for(int i = 0; i < 10; i++){
            //action
            main++;
        }
    }

}
