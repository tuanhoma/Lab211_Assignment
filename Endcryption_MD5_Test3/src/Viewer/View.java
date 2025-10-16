package Viewer;

import java.sql.SQLOutput;

public class View {

    public void choice(){
        System.out.println("----------Program login-----------");
        System.out.println("1. Add User");
        System.out.println("2. Login");
        System.out.println("3. Exit");
        System.out.print("Enter choice: ");
    }

    public void messages(String m){
        System.out.println(m);
    }
}
