import java.util.Random;
import java.util.Scanner;

public class BubbleSort {

    public void arrayRandom(int[] a) {
        Random rand = new Random();
        for(int i = 0; i < a.length; i++){
            a[i] = rand.nextInt(100);
        }
    }

    public void sort(int[] a){
        for(int i = 0; i < a.length - 1; i++) {
            for(int j = 0; j < a.length - i - 1; j++){
                int tmp = a[j];
                if(a[j] > a[j + 1]){
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
    }


}
