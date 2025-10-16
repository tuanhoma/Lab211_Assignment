package Viewer;

public class Validate {

    public static boolean validBinary(String line){
        for(int i = 0; i < line.length(); i++){
            if(line.charAt(i) != '1' && line.charAt(i) != '0'){
                return false;
            }
        }

        return true;
    }

    public static boolean validDecimal(String line){
        int tmp = Integer.parseInt(line);
        for(int i = 0; i < line.length(); i++){
            if(!Character.isDigit(line.charAt(i)) || tmp < 0){
                return false;
            }
        }

        return true;
    }
}
