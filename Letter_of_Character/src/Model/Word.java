package Model;

public class Word {

    private String line;
    private String[] a;

    public Word() {
    }

    public Word(String line){
        this.line = line.trim();
        this.a = this.line.split(" ");
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String[] getA() {
        return a;
    }

    public void setA(String[] a) {
        this.a = a;
    }
}
