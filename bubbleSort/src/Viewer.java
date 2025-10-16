import java.util.Scanner;

public class Viewer {

    private Scanner sc = new Scanner(System.in);

    public int input(){
        int n;
        do{
            System.out.print("Enter n: ");
            n = sc.nextInt();
            if(!Vaidate.vaidNumberArray(n)){
                System.out.println("Wrong! enter again");
            }
        }while(!Vaidate.vaidNumberArray(n));

        return n;
    }

    public void display(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

}
