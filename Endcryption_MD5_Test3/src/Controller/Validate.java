package Controller;

public class Validate {

    public static boolean validEmpty(String s){
        if(s.isEmpty()){
            return false;
        }

        return true;
    }

    public static boolean validPhone(String s){
        if(s.isEmpty()){
            return false;
        }

        if(s.length() < 10 || s.length() > 11){
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
