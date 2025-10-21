package Controller;

import Model.Management;
import Viewer.View;

import java.util.Scanner;

public class Controlle {

    private Scanner sc = new Scanner(System.in);
    private Management man = new Management();
    private View vie = new View();

    public void run(){
        String s;
        do{
            vie.messages("Enter number array: ");
            s = sc.nextLine();
            if(!Validate.validNumber(s)){
                System.out.println("Wrong !");
            }
        }while(!Validate.validNumber(s));
        int n = Integer.parseInt(s);

        int[] a = new int[n];
        man.randArray(a);

        vie.messages("Unsorted: ");
        vie.displayArray(a);

        man.selectionSort(a);
        vie.messages("Sorted: ");
        vie.displayArray(a);
    }
}
