package Controller;

import Model.HashMap;
import Model.Letter;
import Model.Word;
import Viewer.Viewer;

public class countController {

    public void run(){
        Viewer sv = new Viewer();
        HashMap map = new HashMap();
        String line = sv.input();

        Letter number_char = new Letter(line);
        map.countLetter(number_char);

        Word number_Word = new Word(line);
        map.countWord(number_Word);

        sv.displayLetter(map.getLetter());
        sv.displayWord(map.getWord());
    }
}
