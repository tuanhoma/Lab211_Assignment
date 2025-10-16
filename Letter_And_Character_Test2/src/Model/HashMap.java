package Model;

public class HashMap {

    private java.util.HashMap<Character, Integer> Letter = new java.util.HashMap<>();
    private java.util.HashMap<String, Integer> Word = new java.util.HashMap<>();

    public void countLetter(Letter arrayLetter){
        for(char c : arrayLetter.getA()){
            if(c != ' '){
                Letter.put(c, Letter.getOrDefault(c, 0) + 1);
            }
        }
    }

    public void countWord(Word arrayWord) {
        for (String w : arrayWord.getA()) {
            Word.put(w, Word.getOrDefault(w, 0) + 1);
        }
    }

    public java.util.HashMap<Character, Integer> getLetter() {
        return Letter;
    }

    public java.util.HashMap<String, Integer> getWord() {
        return Word;
    }

}
