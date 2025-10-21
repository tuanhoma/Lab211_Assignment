package Model;

import java.util.Random;

public class Management {

    public void randArray(int[] a){
        Random rand = new Random();
        for(int i = 0; i < a.length; i++){
            a[i] = rand.nextInt(100);
        }
    }

    public void selectionSort(int[] a){
        for(int i = 0; i < a.length - 1; i++){
            int minIndex = i;
            int min = a[i];
            for(int j = i + 1; j < a.length; j++){
                if(a[j] < min){
                    min = a[j];
                    minIndex = j;
                }
            }

            int tmp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = tmp;
        }
    }
}
