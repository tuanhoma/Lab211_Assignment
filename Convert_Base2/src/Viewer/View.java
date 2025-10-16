package Viewer;

import java.util.Scanner;

public class View {

    private Scanner sc = new Scanner(System.in);

    public int inputBaseIn(){
        int t;
        System.out.println("Enter base in (2, 10, 16): ");
        t = sc.nextInt();
        return t;
    }

    public int inputBaseOut(){
        int t;
        System.out.println("Enter base Out (2, 10, 16): ");
        t = sc.nextInt();
        return t;
    }

    public String inputBaseHexadecimal(){
        sc.nextLine();
        String line;
        System.out.println("Enter value: ");
        line = sc.nextLine();
        return line;
    }

    public String inputBaseBinary(){
        sc.nextLine();
        String line;
        do{
            System.out.println("Enter value: ");
            line = sc.nextLine();
            if(!Validate.validBinary(line)){
                System.out.println("Wrong! enter again!");
            }
        }while(!Validate.validBinary(line));
        return line;
    }

    public String inputBaseDecimal(){
        sc.nextLine();
        String line;
        do{
            System.out.println("Enter value: ");
            line = sc.nextLine();
            if(!Validate.validDecimal(line)){
                System.out.println("Wrong! enter again!");
            }
        }while(!Validate.validDecimal(line));
        return line;
    }

    public void display(String line){
        System.out.println("Ket qua la: " + line);
    }

}
