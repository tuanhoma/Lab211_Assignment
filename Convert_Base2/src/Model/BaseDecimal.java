package Model;

public class BaseDecimal {

    public String binaryToDecimal(String b){
        int temp = 0;
        for(int i = 0, j = b.length() - 1; i < b.length(); i++, j--){
            int tmp = Character.getNumericValue(b.charAt(j));
            temp += tmp  * (int)Math.pow(2, i);
        }

        String result = String.valueOf(temp);
        return result;
    }

    public String hexadecimalToDecimal(String h) {
        int result = 0;
        for (int i = 0, j = h.length() - 1; i < h.length(); i++, j--) {
            int value = Character.getNumericValue(h.charAt(j));
            result += value * (int)Math.pow(16, i);
        }
        return String.valueOf(result);
    }

}
