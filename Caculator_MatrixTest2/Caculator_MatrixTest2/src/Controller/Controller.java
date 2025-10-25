package Controller;

import Model.ManagementMatrix;
import Viewer.View;

import java.util.Scanner;

public class Controller {

    private Scanner sc = new Scanner(System.in);
    private View vie = new View();
    private ManagementMatrix matrix = new ManagementMatrix();

    public void run(){
        while(true){
            String s;
            do{
                vie.choice();
                s = sc.nextLine();
                if(!Validate.validInput(s)){
                    System.out.println("Wrong !");
                }
            }while(!Validate.validInput(s));
            int t = Integer.parseInt(s);

            switch (t){
                case 1:
                    handleAddtionMatrix();
                    break;


                case 2:
                    handleSubmationMatrix();
                    break;


                case 3:
                    handleMuntitionMatrix();
                    break;


                case 4:
                    System.out.println("Exit !");
                    return;



                default:
                    break;
            }
        }
    }

    public void handleAddtionMatrix(){
        System.out.println("--------Addtion Matrix--------");
        System.out.println("Enter Matrix 1:");
        int r1 = handleEnterRow();
        int c1 = handleEnterColumn();
        int[][] a = handleMatrix(r1, c1);

        System.out.println("Enter Matrix 2:");
        int r2 = handleEnterRow();
        int c2 = handleEnterColumn();
        int[][] b = handleMatrix(r2, c2);

        if(r1 == r2 && c1 == c2){
            int[][] result = matrix.addtionMatrix(a, b, r1, c1);
            vie.display(result, r1, c1);
        }else{
            System.out.println("Wong!");
        }
    }

    public void handleSubmationMatrix(){
        System.out.println("--------Submation Matrix--------");
        System.out.println("Enter Matrix 1:");
        int r1 = handleEnterRow();
        int c1 = handleEnterColumn();
        int[][] a = handleMatrix(r1, c1);

        System.out.println("Enter Matrix 2:");
        int r2 = handleEnterRow();
        int c2 = handleEnterColumn();
        int[][] b = handleMatrix(r2, c2);

        if(r1 == r2 && c1 == c2){
            int[][] result = matrix.submationMatrix(a, b, r1, c1);
            vie.display(result, r1, c1);
        }else{
            System.out.println("Wong!");
        }
    }

    public void handleMuntitionMatrix(){
        System.out.println("--------Muniaple Matrix--------");
        System.out.println("Enter Matrix 1:");
        int r1 = handleEnterRow();
        int c1 = handleEnterColumn();
        int[][] a = handleMatrix(r1, c1);

        System.out.println("Enter Matrix 2:");
        int r2 = handleEnterRow();
        int c2 = handleEnterColumn();
        int[][] b = handleMatrix(r2, c2);

        if(r1 == r2 && c1 == c2){
            int[][] result = matrix.muntiableMatrix(a, b, r1, c1);
            vie.display(result, r1, c1);
        }else{
            System.out.println("Wong!");
        }
    }

    public int handleEnterRow(){
        String s;
        do{
            vie.enterRow1();
            s = sc.nextLine();
            if(!Validate.validInput(s)){
                System.out.println("Wrong !");
            }
        }while(!Validate.validInput(s));
        int row1 = Integer.parseInt(s);

        return row1;
    }

    public int handleEnterColumn(){
        String s;
        do{
            vie.enterColumn1();
            s = sc.nextLine();
            if(!Validate.validInput(s)){
                System.out.println("Wrong !");
            }
        }while(!Validate.validInput(s));
        int Column2 = Integer.parseInt(s);

        return Column2;
    }

    public int[][] handleMatrix(int n, int m){
        int[][] a = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                vie.enterMatrix(i, j);
                a[i][j] = sc.nextInt();
            }
        }
        sc.nextLine();

        return a;
    }
}
