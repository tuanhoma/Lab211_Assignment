public class Control {

    public void run(){
        Viewer vie = new Viewer();
        int n = vie.input();

        int[] a = new int[n];
        Model m = new Model();
        m.randArray(a);

        vie.displayArray(a);
        System.out.println();
        int key = vie.key();
        int result = m.nearSreach(a, key);

        vie.displayIndex(result);
    }

}
