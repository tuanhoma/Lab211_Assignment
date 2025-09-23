
public class Recursive {

    public static int Recursive_Fibonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return Recursive_Fibonacci(n - 1) + Recursive_Fibonacci(n - 2);
    }

}
