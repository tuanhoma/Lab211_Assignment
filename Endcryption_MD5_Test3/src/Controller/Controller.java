package Controller;

import Model.ManagementUser;
import Viewer.View;

import java.util.Scanner;

public class Controller {

    private Scanner sc = new Scanner(System.in);
    private View vie = new View();
    private HandleController han = new HandleController();

    public void run(){
        while(true){
            vie.choice();
            int t = sc.nextInt();
            sc.nextLine();

            switch (t){
                case 1:
                    han.handleAddUser();
                    break;



                case 2:
                    han.handleLogin();
                    break;



                case 3:
                    vie.messages("Exit !");
                    return;



                default:
                    break;
            }
        }
    }
}
