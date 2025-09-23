package Viewer;

import Model.Letter;

import java.util.HashMap;
import java.util.Scanner;

public class Viewer {

    private Scanner sc = new Scanner(System.in);

    public String input(){
        String line;
        do{
            System.out.println("Enter String: ");
            line = sc.nextLine();
            if(!Validate.isEmpty(line)){
                System.out.println("Wrong!");
            }
        }while(!Validate.isEmpty(line));

        return line;
    }

    public void displayLetter(HashMap<Character, Integer> letter){
        System.out.println("Letter: " + letter);
    }

    public void displayWord(HashMap<String, Integer> word){
        System.out.println("Word: " + word);
    }

}
