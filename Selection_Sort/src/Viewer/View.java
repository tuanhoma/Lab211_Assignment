package Viewer;

public class View {

    public void displayArray(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public void messages(String s){
        System.out.println(s);
    }
}
