public class Controller {

    public void run(){
        Viewer vie = new Viewer();
        int n = vie.input();

        int[] a = new int[n];
        BubbleSort sv = new BubbleSort();
        sv.arrayRandom(a);

        System.out.println("Unsort: ");
        vie.display(a);

        System.out.println();
        System.out.println("Sort: ");
        sv.sort(a);
        vie.display(a);
    }
}
