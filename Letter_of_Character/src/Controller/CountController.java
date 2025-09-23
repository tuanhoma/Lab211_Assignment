package Controller;

import Model.HashMap;
import Model.Letter;
import Model.Word;
import Viewer.Viewer;

public class CountController {

    public void run(){
        Viewer view = new Viewer();
        String line = view.input();

        Letter letter = new Letter(line);
        Word word = new Word(line);

        HashMap map = new HashMap();
        map.countLetter(letter.getA());
        map.countWord(word.getA());

        view.displayWord(map.getMapWord());
        view.displayLetter(map.getMapLetter());
    }
}
