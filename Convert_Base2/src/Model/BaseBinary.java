package Model;

public class BaseBinary {

    public String decimalToBinary(String d){
        String result = "";
        StringBuilder temp = new StringBuilder();
        int tmp = Integer.parseInt(d);
        while(tmp != 0){
            if(tmp % 2 != 0){
                temp.append('1');
            }else{
                temp.append('0');
            }

            tmp /= 2;
        }

        result = temp.reverse().toString();

        return result;
    }
}
