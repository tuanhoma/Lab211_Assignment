package Viewer;

import java.util.Scanner;

public class View {

    private Scanner sc = new Scanner(System.in);

    public int choice(){
        System.out.println("-------Login Program-------");
        System.out.println("1. Vietnamese");
        System.out.println("2. English");
        System.out.println("3. Exit");
        System.out.println("Please choice one option: ");
        int t = sc.nextInt();
        sc.nextLine(); // fix trôi dòng
        return t;
    }

    public String inputAccount(){
        return sc.nextLine();
    }

    public String inputPassword(){
        return sc.nextLine();
    }

    public String inputCaptcha(){
        return sc.nextLine();
    }
}
