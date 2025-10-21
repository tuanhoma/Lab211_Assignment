package Controller;

public class Validate {

    public static boolean validNumber(String s){
        if(s.isEmpty()){
            return false;
        }

        for(int i = 0; i < s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                return false;
            }
        }

        return true;
    }
}
