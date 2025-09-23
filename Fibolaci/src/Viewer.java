import java.util.Scanner;

public class Viewer {

    private Scanner sc;
    private int n;

    public void input(){
        do{
            System.out.println("Enter number : ");
            if(n < 2){
                System.out.println("Enter angain!");
            }
        }while(n < 2);
    }

    public void displayDefault(){
        System.out.println("The 45 sequence fibonacci: ");
        for(int i = 0; i <= 45; i++){
            System.out.print(Recursive.Recursive_Fibonacci(i) + " ");
        }
        System.out.println("Done !");
    }

    public void displayOfN(){
        System.out.println("The 45 sequence fibonacci: ");
        for(int i = 0; i <= n; i++){
            System.out.print(Recursive.Recursive_Fibonacci(i) + " ");
        }
        System.out.println("Done !");
    }
}
