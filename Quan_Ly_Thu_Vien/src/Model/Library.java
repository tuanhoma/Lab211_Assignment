package Model;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> listBook = new ArrayList<>();
    private ArrayList<User> listUser = new ArrayList<>();

    public void DataSample() {
        // Thêm sẵn sách vào danh sách
        listBook.add(new Book("B001", "Clean Code", "Robert C. Martin", 2008, true));
        listBook.add(new Book("B002", "The Pragmatic Programmer", "Andrew Hunt", 1999, true));
        listBook.add(new Book("B003", "Effective Java", "Joshua Bloch", 2018, false));
        listBook.add(new Book("B004", "Head First Design Patterns", "Eric Freeman", 2004, true));
        listBook.add(new Book("B005", "Refactoring", "Martin Fowler", 2018, false));

        // Thêm sẵn người dùng vào danh sách
        listUser.add(new User("U001", "alice@example.com", "Alice Nguyen"));
        listUser.add(new User("U002", "bob@example.com", "Bob Tran"));
        listUser.add(new User("U003", "charlie@example.com", "Charlie Pham"));
        listUser.add(new User("U004", "diana@example.com", "Diana Le"));
        listUser.add(new User("U005", "eric@example.com", "Eric Vo"));
    }

    public boolean addBook(Book b){
        if(ValidateModel.validAddBook(b, listBook)){
            listBook.add(b);
            return true;
        }else{
            return false;
        }
    }

    public boolean updateBook(Book b, String key){
        if(ValidateModel.validFoundBook(key, listBook)){
            for(Book k : listBook){
                if(k.getId().equals(key)){
                    k.setId(b.getId());
                    k.setTitle(b.getTitle());
                    k.setAuthor(b.getAuthor());
                    k.setYear(b.getYear());
                    k.setStatus(b.isStatus());
                }
                return true;
            }
        }

        return false;
    }

    public boolean DeleteBook(String key){
        if(ValidateModel.validFoundBook(key, listBook)){
            for(Book k : listBook){
                if(k.getId().equals(key)){
                    listBook.remove(k);
                    return true;
                }
            }
        }

        return false;
    }

    public ArrayList<Book> searchBook(String key){
        ArrayList<Book> list = new ArrayList<>();
            for(Book k : listBook){
                if(k.getTitle().contains(key)){
                    list.add(k);
                }
            }

        return list;
    }

    //------------------------------------------------------
    public boolean addUser(User u){
        if(ValidateModel.validAddUser(u, listUser)){
            listUser.add(u);
            return true;
        }else{
            return false;
        }
    }

    public boolean updateUser(User b, String key){
        if(ValidateModel.validFoundUser(key, listUser)){
            for(User k : listUser){
                if(k.getId().equals(key)){
                    k.setId(b.getId());
                    k.setEmail(b.getEmail());
                    k.setName(b.getName());
                }
                return true;
            }
        }

        return false;
    }

    public boolean DeleteUser(String key){
        if(ValidateModel.validFoundUser(key, listUser)){
            for(User k : listUser){
                if(k.getId().equals(key)){
                    listUser.remove(k);
                    return true;
                }
            }
        }

        return false;
    }

    public User searchUser(String key){
        if(ValidateModel.validFoundUser(key, listUser)){
            for(User k : listUser){
                if(k.getId().equals(key)){
                    return k;
                }
            }
        }

        return null;
    }

    public ArrayList<Book> getListBook() {
        return listBook;
    }

    public ArrayList<User> getListUser() {
        return listUser;
    }
}
