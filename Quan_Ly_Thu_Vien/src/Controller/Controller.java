package Controller;

import Model.Book;
import Model.Library;
import Model.User;
import Viewer.View;

import java.util.Scanner;

public class Controller {

    private View vie = new View();
    private Library lib = new Library();
    private Scanner sc = new Scanner(System.in);

    public void run(){
        lib.DataSample();

        while(true){
            int t = vie.choice();

            switch (t){
                case 1:
                    int choiceBook = vie.choiceManagementBook();

                    switch (choiceBook){
                        case 1:
                            handleAddBook();
                            break;

                        case 2:
                            handleUpdateBook();
                            break;

                        case 3:
                            handleDeleteBook();
                            break;

                        case 4:
                            handleSearchBook();
                            break;

                        default:
                            System.out.println("Exit !");
                            break;
                    }
                break;

                case 2:
                    int choiceUser = vie.choiceManagementUser();
                    switch (choiceUser){
                        case 1:
                            handleAddUser();
                            break;

                        case 2:
                            handleUpdateUser();
                            break;

                        case 3:
                            handleDeleteUser();
                            break;

                        case 4:
                            handleSearchUser();
                            break;

                        default:
                            System.out.println("Exit !");
                            break;
                    }
                break;

                default:
                    System.out.println("Valid !");
                    return;
            }
        }
    }


    public void handleAddBook(){
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
        Book add = new Book(id, title, author, year, status);
        if(lib.addBook(add)){
            System.out.println("Them thanh cong!");
        }else{
            System.out.println("Da ton tai");
        }
    }

    public void handleUpdateBook(){
        String key;
        do{
            key = vie.foundKey();
            if(!Validate.validInformation(key)){
                System.out.println("Vui long nhap lai !");
            }
        }while(!Validate.validInformation(key));

        Book b = vie.addUpdateBook();

        if(lib.updateBook(b, key)){
            System.out.println("Cap nhat thanh cong!");
        }else{
            System.out.println("cap nhat khong thanh cong !");
        }
    }

    public void handleDeleteBook(){
        String key;
        do{
            key = vie.foundKey();
            if(!Validate.validInformation(key)){
                System.out.println("Vui long nhap lai !");
            }
        }while(!Validate.validInformation(key));

        if(lib.DeleteBook(key)){
            System.out.println("Xoa thanh cong!");
        }else{
            System.out.println("Xoa khong thanh cong!");
        }
    }

    public void handleSearchBook(){
        String key;
        do{
            key = vie.foundKey();
            if(!Validate.validInformation(key)){
                System.out.println("Vui long nhap lai !");
            }
        }while(!Validate.validInformation(key));


        vie.displayAllBook(lib.searchBook(key));
    }

    //----------------------------------------------------------------

    public void handleAddUser(){
        User add = vie.addUpdateUser();
        if(lib.addUser(add)){
            System.out.println("Them thanh cong!");
        }else{
            System.out.println("Da ton tai");
        }
    }

    public void handleUpdateUser(){
        String key;
        do{
            key = vie.foundKey();
            if(!Validate.validInformation(key)){
                System.out.println("Vui long nhap lai !");
            }
        }while(!Validate.validInformation(key));

        User b = vie.addUpdateUser();

        if(lib.updateUser(b, key)){
            System.out.println("Cap nhat thanh cong!");
        }else{
            System.out.println("cap nhat khong thanh cong !");
        }
    }

    public void handleDeleteUser(){
        String key;
        do{
            key = vie.foundKey();
            if(!Validate.validInformation(key)){
                System.out.println("Vui long nhap lai !");
            }
        }while(!Validate.validInformation(key));

        if(lib.DeleteUser(key)){
            System.out.println("Xoa thanh cong!");
        }else{
            System.out.println("Xoa khong thanh cong!");
        }
    }

    public void handleSearchUser(){
        String key;
        do{
            key = vie.foundKey();
            if(!Validate.validInformation(key)){
                System.out.println("Vui long nhap lai !");
            }
        }while(!Validate.validInformation(key));

        if(lib.searchUser(key) != null){
            vie.displayUser(lib.searchUser(key));
        }else{
            vie.displayAllUser(lib.getListUser());
        }
    }
}
