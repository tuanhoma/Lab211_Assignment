import java.util.Random;

public class Model {

    public int nearSreach(int[] a, int key){
        for(int i = 0; i < a.length; i++){
            if(a[i] == key){
                return i;
            }
        }

        return -1;
    }

    public void randArray(int[] a){
        Random rand = new Random();
        for(int i = 0; i < a.length; i++){
            a[i] = rand.nextInt(100);
        }
    }
}
