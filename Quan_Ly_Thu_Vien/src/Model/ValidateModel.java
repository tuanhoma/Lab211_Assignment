package Model;

import java.util.ArrayList;

public class ValidateModel {

    public static boolean validAddBook(Book b, ArrayList<Book> list){
        boolean found_title = false;
        boolean found_author = false;
        boolean found_year = false;
        for(Book k : list){
            if(k.getTitle().equals(b.getTitle())){
                found_title = true;
            }

            if(k.getAuthor().equals(b.getAuthor())){
                found_author = true;
            }

            if(k.getYear() == b.getYear()){
                found_year = true;
            }
        }

        if(found_title && found_author && found_year){
            return false;
        }

        return true;
    }

    public static boolean validFoundBook(String key, ArrayList<Book> list){
        for(Book k : list){
            if(k.getId().equals(key)){
                return true;
            }
        }

        return false;
    }
//----------------------------------
    public static boolean validAddUser(User b, ArrayList<User> list){
        for(User k : list){
            if(k.getId().equals(b.getId())){
                return false;
            }
        }

        return true;
    }

    public static boolean validFoundUser(String key, ArrayList<User> list){
        for(User k : list){
            if(k.getId().equals(key)){
                return true;
            }
        }

        return false;
    }
}
