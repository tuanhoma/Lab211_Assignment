package Model;

public class BaseHexadecimal {

    public String decimalToHexadecimal(String d){
        String result = "";
        StringBuilder tmp = new StringBuilder();
        int temp = Integer.parseInt(d);
        while(temp != 0){
            char[] hexMap = "0123456789ABCDEF".toCharArray();
            tmp.append(hexMap[temp % 16]);

            temp /= 16;
        }

        result = tmp.reverse().toString();
        return result;
    }
}
