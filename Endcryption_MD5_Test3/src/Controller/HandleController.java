package Controller;

import Model.ManagementUser;
import Model.User;
import Viewer.View;

import java.util.PrimitiveIterator;
import java.util.Scanner;

public class HandleController {

    private View vie = new View();
    private Scanner sc = new Scanner(System.in);
    private ManagementUser man = new ManagementUser();

    public void handleAddUser(){
        String Username;
        String Password;
        String Name;
        String Phone;
        String Email;
        String Address;
        String DateOfBirth;

        do{
            vie.messages("Enter Username: ");
            Username = sc.nextLine();
            if(!Validate.validEmpty(Username)){
                vie.messages("Wrong !");
            }
        }while(!Validate.validEmpty(Username));

        do{
            vie.messages("Enter Password: ");
            Password = sc.nextLine();
            if(!Validate.validEmpty(Password)){
                vie.messages("Wrong !");
            }
        }while(!Validate.validEmpty(Password));

        do{
            vie.messages("Enter Name: ");
            Name = sc.nextLine();
            if(!Validate.validEmpty(Name)){
                vie.messages("Wrong !");
            }
        }while(!Validate.validEmpty(Name));

        do{
            vie.messages("Enter Phone: ");
            Phone = sc.nextLine();
            if(!Validate.validEmpty(Phone)){
                vie.messages("Wrong !");
            }
        }while(!Validate.validEmpty(Phone));

        do{
            vie.messages("Enter Email: ");
            Email = sc.nextLine();
            if(!Validate.validEmpty(Email)){
                vie.messages("Wrong !");
            }
        }while(!Validate.validEmpty(Email));

        do{
            vie.messages("Enter Address: ");
            Address = sc.nextLine();
            if(!Validate.validEmpty(Address)){
                vie.messages("Wrong !");
            }
        }while(!Validate.validEmpty(Address));

        do{
            vie.messages("Enter DateOfBirth: ");
            DateOfBirth = sc.nextLine();
            if(!Validate.validEmpty(DateOfBirth)){
                vie.messages("Wrong !");
            }
        }while(!Validate.validEmpty(DateOfBirth));

        Password = man.getMD5(Password);
        User sv = new User(Username, Password, Name, Phone, Email, Address, DateOfBirth);
        if(man.addUser(sv)){
            vie.messages("Thanh cong !");
        }else{
            vie.messages("Khong thanh cong");
        }
    }

    public void handleLogin(){
        String Username;
        String Password;

        do{
            vie.messages("Enter Username: ");
            Username = sc.nextLine();
            if(!Validate.validEmpty(Username)){
                vie.messages("Wrong !");
            }
        }while(!Validate.validEmpty(Username));

        do{
            vie.messages("Enter Password: ");
            Password = sc.nextLine();
            if(!Validate.validEmpty(Password)){
                vie.messages("Wrong !");
            }
        }while(!Validate.validEmpty(Password));

        Password = man.getMD5(Password);
        if(man.login(Username, Password)){
            handleUpdate(Username);
        }else{
            System.out.println("Sai mat khau!");
        }
    }

    public void handleUpdate(String Username){
        vie.messages("Login thanh cong !");
        vie.messages("Ban co muon doi mat khau ko (Y/N)!");
        String choice = sc.nextLine();
        if(choice.charAt(0) == 'Y'){
            String newPass;
            String renewPass;
            do{
                vie.messages("Enter new pass: ");
                newPass = sc.nextLine();
                if(!Validate.validEmpty(newPass)){
                    vie.messages("Wrong !");
                }
            }while(!Validate.validEmpty(newPass));

            do{
                vie.messages("Enter renew pass: ");
                renewPass = sc.nextLine();
                if(!Validate.validEmpty(renewPass) || !(newPass.equals(renewPass))){
                    vie.messages("Wrong !");
                }
            }while(!Validate.validEmpty(renewPass) || !(newPass.equals(renewPass)));

            newPass = man.getMD5(newPass);
            if(man.updatePass(Username, newPass)){
                vie.messages("Doi Mat khau thanh cong !");
            }else{
                vie.messages("doi mat khau khong thanh cong!");
            }
        }
    }
}
