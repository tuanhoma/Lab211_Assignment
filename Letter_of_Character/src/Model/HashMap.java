package Model;

public class HashMap {

    private java.util.HashMap<String, Integer> mapWord = new java.util.HashMap<>();
    private java.util.HashMap<Character, Integer> mapLetter = new java.util.HashMap<>();

    public void countWord(String[] a){
        for(String w : a){
            mapWord.put(w, mapWord.getOrDefault(w, 0) + 1);
        }
    }

    public void countLetter(char[] a){
        for(Character c : a) {
            if (c != ' ') {
                mapLetter.put(c, mapLetter.getOrDefault(c, 0) + 1);
            }
        }
    }

    public java.util.HashMap<String, Integer> getMapWord() {
        return mapWord;
    }

    public void setMapWord(java.util.HashMap<String, Integer> mapWord) {
        this.mapWord = mapWord;
    }

    public java.util.HashMap<Character, Integer> getMapLetter() {
        return mapLetter;
    }

    public void setMapLetter(java.util.HashMap<Character, Integer> mapLetter) {
        this.mapLetter = mapLetter;
    }
}
