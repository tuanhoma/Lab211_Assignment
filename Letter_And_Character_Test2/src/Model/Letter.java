package Model;

public class Letter {

    private String line;
    private char[] a;

    public Letter() {
    }

    public Letter(String line) {
        this.line = line;
        this.a = this.line.toCharArray();
    }

    public char[] getA() {
        return a;
    }

    public void setA(char[] a) {
        this.a = a;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

}
