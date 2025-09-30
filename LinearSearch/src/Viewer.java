import java.util.Scanner;

public class Viewer {

    private Scanner sc = new Scanner(System.in);

    public int input(){
        int n;
        do{
            System.out.print("Enter number Array: ");
            n = sc.nextInt();
            if(!Validate.validNumberArray(n)){
                System.out.println("Wrong enter again!");
            }
        }while(!Validate.validNumberArray(n));

        return n;
    }

    public int key(){
        int k;
        do{
            System.out.print("Enter key: ");
            k = sc.nextInt();
            if(!Validate.validNumberKey(k)){
                System.out.println("Wrong enter again!");
            }
        }while(!Validate.validNumberKey(k));

        return k;
    }


    public void displayArray(int[] a){
        System.out.print("Array: ");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

    public void displayIndex(int a){
        if(a != -1){
            System.out.print("Index: " + a);
        }else{
            System.out.println("Not found !");
        }
    }
}
