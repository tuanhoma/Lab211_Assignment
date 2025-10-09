package Controller;

import Model.RandCaptcha;
import Model.Validate;
import Viewer.View;

import java.util.Locale;
import java.util.ResourceBundle;

public class Control {

    private View vie = new View();
    Locale vilocale = new Locale("vi", "VN");
    Locale enlocale = new Locale("en", "US");

    ResourceBundle bundleVi = ResourceBundle.getBundle("Messages", vilocale);
    ResourceBundle bundleEn = ResourceBundle.getBundle("Messages", enlocale);

    public void run(){
        while(true){
            int t = vie.choice();
            switch (t){
                case 1:
                    handleVietnamese();
                    break;

                case 2:
                    handleEnglish();
                    break;

                case 3:
                    System.out.println("Exit");
                    return;

                default:
                    System.out.println("Invalid!");
                    break;
            }
        }
    }

    public void handleVietnamese(){
        String account;
        do{
            System.out.print(bundleVi.getString("account"));
            account = vie.inputAccount();
            if(!Validate.validAccount(account)){
                System.out.println(bundleVi.getString("error.account"));
            }
        }while(!Validate.validAccount(account));


        String password;
        do{
            System.out.print(bundleVi.getString("password"));
            password = vie.inputPassword();
            if(!Validate.validPassword(password)){
                System.out.println(bundleVi.getString("error.password"));
            }
        }while(!Validate.validPassword(password));


        String captchaValid;
        String captcha = RandCaptcha.captchaRand(5);
        do{
            System.out.println(bundleVi.getString("captcha") + captcha);
            System.out.print(bundleVi.getString("captchaEnter"));
            captchaValid = vie.inputCaptcha();
            if(!Validate.validCaptcha(captcha, captchaValid)){
                System.out.println(bundleVi.getString("error.captcha"));
            }
        }while(!Validate.validCaptcha(captcha, captchaValid));

        System.out.println(bundleVi.getString("success"));
    }

    public void handleEnglish(){
        String account;
        do{
            System.out.print(bundleEn.getString("account"));
            account = vie.inputAccount();
            if(!Validate.validAccount(account)){
                System.out.println(bundleEn.getString("error.account"));
            }
        }while(!Validate.validAccount(account));


        String password;
        do{
            System.out.print(bundleEn.getString("password"));
            password = vie.inputPassword();
            if(!Validate.validPassword(password)){
                System.out.println(bundleEn.getString("error.password"));
            }
        }while(!Validate.validPassword(password));

        String captchaValid;
        String captcha = RandCaptcha.captchaRand(5);
        do{
            System.out.println(bundleEn.getString("captcha") + captcha);
            System.out.print(bundleEn.getString("captchaEnter"));
            captchaValid = vie.inputCaptcha();
            if(!Validate.validCaptcha(captcha, captchaValid)){
                System.out.println(bundleEn.getString("error.captcha"));
            }
        }while(!Validate.validCaptcha(captcha, captchaValid));
        System.out.println(bundleEn.getString("success"));
    }

}
