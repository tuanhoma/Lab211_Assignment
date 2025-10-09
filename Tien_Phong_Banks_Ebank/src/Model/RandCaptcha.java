package Model;

import java.util.Random;

public class RandCaptcha {

    public static String captchaRand(int length){
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(chars.length());// là random số từ 0 đến 61 trơng chuỗi trên
            sb.append(chars.charAt(index));// từ vị trí index đó tìm kí tự tương ứng add vào chuỗi
        }

        return sb.toString();
    }
}
