package Model;

public class Validate {

    public static boolean validAccount(String s){
        if(s.length() != 10){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            if(!Character.isDigit(s.charAt(i))){
                return false;
            }
        }

        return true;
    }

    public static boolean validPassword(String s){
        boolean foundKiTu = false;
        boolean foundSo = false;

        if(!(s.length() >= 8 && s.length() <= 31)){
            return false;
        }

        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                foundSo = true;
            }
            if(Character.isLetter(s.charAt(i))){
                foundKiTu = true;
            }

            if(foundKiTu && foundSo){
                return true;
            }
        }

        return false;
    }

    public static boolean validCaptcha(String a, String b){
        if(a.equals(b)){
            return true;
        }

        return false;
    }
}
