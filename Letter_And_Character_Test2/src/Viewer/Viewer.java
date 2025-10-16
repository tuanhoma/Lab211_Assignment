package Viewer;

import java.util.HashMap;
import java.util.Scanner;

public class Viewer {

    private String line;

    public String input(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter the word: ");
            line = sc.nextLine();
            if(Validate.isEmpty(line)){
                System.out.println("Wrong enter again!");
            }
        }while(Validate.isEmpty(line));

        return line;
    }

    public void displayLetter(HashMap<Character, Integer> Letter){
        System.out.println("Letter: " + Letter);
    }

    public void displayWord(HashMap<String, Integer> Word){
        System.out.println("Letter: " + Word);
    }
}
