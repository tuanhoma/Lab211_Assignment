package Viewer;

import Model.Book;
import Model.User;

import java.util.ArrayList;
import java.util.Scanner;

public class View {

    private Scanner sc = new Scanner(System.in);

    public int choice(){
        System.out.println("------------Management library-----------");
        System.out.println("1. Quan ly sach");
        System.out.println("2. Quan ly nguoi dung");
        System.out.println("3. exit");
        int t = sc.nextInt();
        sc.nextLine();
        return t;
    }

    public int choiceManagementBook(){
        System.out.println("------------Management Book------------");
        System.out.println("1. Them sach");
        System.out.println("2. Cap nhat sach");
        System.out.println("3. Xoa sach");
        System.out.println("4. Tim kiem sach");
        System.out.println("Exit");
        int t = sc.nextInt();
        sc.nextLine();
        return t;
    }

    public int choiceManagementUser(){
        System.out.println("------------Management User------------");
        System.out.println("1. Them nguoi dung");
        System.out.println("2. Cap nguoi dung");
        System.out.println("3. Xoa nguoi dung");
        System.out.println("4. Tim kiem nguoi dung");
        System.out.println("Exit");
        int t = sc.nextInt();
        sc.nextLine();
        return t;
    }

    public Book addUpdateBook(){
        System.out.print("Enter ID: ");
        String id = sc.nextLine();
        System.out.print("Enter title: ");
        String title = sc.nextLine();
        System.out.print("Enter author: ");
        String author = sc.nextLine();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter status");
        boolean status = sc.nextBoolean();
        return new Book(id, title, author, year, status);
    }

    public User addUpdateUser(){
        System.out.print("Enter ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        return new User(id, email, name);
    }

    public String foundKey(){
        System.out.print("Enter key: ");
        String key = sc.nextLine();
        return key;
    }

    public void displayBook(Book b){
        System.out.println(b);
    }

    public void displayUser(User u){
        System.out.println(u);
    }

    public void displayAllBook(ArrayList<Book> list){
        for(Book b : list){
            System.out.println(b.toString());
        }
    }

    public void displayAllUser(ArrayList<User> list){
        for(User u : list){
            System.out.println(u.toString());
        }
    }
}
