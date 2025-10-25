package Viewer;

public class View {

    public void choice(){
        System.out.println("--------Matrix-------");
        System.out.println("1. Additon Matrix");
        System.out.println("2. Subtion Matrix");
        System.out.println("3. Muntiable Matrix");
        System.out.println("4. Exit !");
    }

    public void enterRow1(){
        System.out.print("Enter rows: ");
    }

    public void enterColumn1(){
        System.out.print("Enter column: ");
    }

    public void enterMatrix(int i, int j){
        System.out.print("Matrix [" + i + "]" + "[" + j + "]: ");
    }

    public void display(int[][] a, int n, int m){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print("[" + a[i][j] + "]");
            }
            System.out.println();
        }
    }

}
