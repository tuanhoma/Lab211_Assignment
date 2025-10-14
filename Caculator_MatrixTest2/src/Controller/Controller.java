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
                    System.out.println("--------Addtion Matrix--------");
                    System.out.println("Enter Matrix 1:");
                    int r1 = handleEnterRow();
                    int c1 = handleEnterColumn();
                    int[][] a = handleMatrix(r1, c1);

                    System.out.println("Enter Matrix 2:");
                    int r2 = handleEnterRow();
                    int c2 = handleEnterColumn();
                    int[][] b = handleMatrix(r2, c2);

                    int n = handleRow(r1, r2);
                    int m = handleColumn(c1, c2);

                    int[][] result = matrix.addtionMatrix(a, b, n, m);
                    vie.display(result, n, m);
                    break;


                case 2:
                    System.out.println("--------Submation Matrix--------");
                    System.out.println("Enter Matrix 1:");
                    int r3 = handleEnterRow();
                    int c3 = handleEnterColumn();
                    int[][] a1 = handleMatrix(r3, c3);

                    System.out.println("Enter Matrix 2:");
                    int r4 = handleEnterRow();
                    int c4 = handleEnterColumn();
                    int[][] b1 = handleMatrix(r4, c4);

                    int n1 = handleRow(r3, r4);
                    int m1 = handleColumn(c3, c4);

                    int[][] result1 = matrix.submationMatrix(a1, b1, n1, m1);
                    vie.display(result1, n1, m1);
                    break;


                case 3:
                    System.out.println("--------Muntiable Matrix--------");
                    System.out.println("Enter Matrix 1:");
                    int r5 = handleEnterRow();
                    int c5 = handleEnterColumn();
                    int[][] a2 = handleMatrix(r5, c5);

                    System.out.println("Enter Matrix 2:");
                    int r6 = handleEnterRow();
                    int c6 = handleEnterColumn();
                    int[][] b2 = handleMatrix(r6, c6);

                    int n2 = handleRow(r5, r6);
                    int m2 = handleColumn(c5, c6);

                    int[][] result2 = matrix.muntiableMatrix(a2, b2, n2, m2);
                    vie.display(result2, n2, m2);
                    break;



                case 4:
                    System.out.println("Exit !");
                    return;



                default:
                    break;
            }
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

    public int handleRow(int n1, int n2){
        return Math.min(n1, n2);
    }

    public int handleColumn(int m1, int m2){
        return Math.min(m1, m2);
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
