package Model;

import java.util.ArrayList;

public class ValidateModel {

    public static boolean validAddUser(ArrayList<User> list, User user){
        if(user == null){
            return false;
        }

        for(User s : list){
            if(s.getUsername().equals(user.getUsername())){
                return false;
            }
        }

        return true;
    }
}
