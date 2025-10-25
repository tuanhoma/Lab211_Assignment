package Controller;

public class Validate {

    public static boolean validInput(String s){
        if(s.isEmpty()){
            return false;
        }

        for(int i = 0; i < s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                return false;
            }
        }

        int tmp = Integer.parseInt(s);
        if(tmp <= 0){
            return false;
        }

        return true;
    }

}
