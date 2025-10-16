package Model;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class ManagementUser {

    private ArrayList<User> list = new ArrayList<>();

    public boolean addUser(User user){
        if(ValidateModel.validAddUser(list, user)){
            list.add(user);
            return true;
        }

        return false;
    }

    public boolean login(String user, String pass){
        for(User s : list){
            if(s.getUsername().equals(user) && s.getPassword().equals(pass)){
                return true;
            }
        }

        return false;
    }

    public boolean updatePass(String user, String pass){
        for(User s : list){
            if(s.getUsername().equals(user)){
                s.setPassword(pass);
                return true;
            }
        }

        return false;
    }

    public String getMD5(String input){
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messagesDigest = md.digest(input.getBytes());
            StringBuilder sb = new StringBuilder();
            for(byte b : messagesDigest){
                sb.append(String.format("%02x", b));
            }

            return sb.toString();
        }catch (NoSuchAlgorithmException e){
            return null;
        }
    }
}
