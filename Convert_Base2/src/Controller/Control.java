package Controller;

import Model.BaseBinary;
import Model.BaseDecimal;
import Model.BaseHexadecimal;
import Viewer.View;

public class Control {

    private View vie = new View();
    private BaseBinary bin = new BaseBinary();
    private BaseDecimal dec = new BaseDecimal();
    private BaseHexadecimal hex = new BaseHexadecimal();

    public void run(){
        int a = vie.inputBaseIn();
        int b = vie.inputBaseOut();

        if(a == 2 && b == 2){
            System.out.println("2 to 2: ");
            handleBinToBin();
        }else if(a == 2 && b == 10){
            System.out.println("2 to 10: ");
            handleBinToDec();
        }else if(a == 2 && b == 16){
            System.out.println("2 to 16: ");
            handleBinToHex();
        }else if(a == 10 && b == 2){
            System.out.println("10 to 2: ");
            handleDecToBin();
        }else if(a == 10 && b == 10){
            System.out.println("10 to 10: ");
            handleDecToDec();
        }else if(a == 10 && b == 16){
            System.out.println("10 to 16: ");
            handleDecToHex();
        }else if(a == 16 && b == 2){
            System.out.println("16 to 2: ");
            handleHexToBin();
        }else if(a == 16 && b == 10){
            System.out.println("16 to 10: ");
            handleHexToDec();
        }else if(a == 16 && b == 16){
            System.out.println("16 to 16: ");
            handleHexToHex();
        }
    }

    public void handleBinToBin(){
        String tmp = vie.inputBaseBinary();
        vie.display(tmp);
    }

    public void handleBinToDec(){
        String tmp = vie.inputBaseBinary();
        String binDec = dec.binaryToDecimal(tmp);
        vie.display(binDec);
    }

    public void handleBinToHex(){
        String tmp = vie.inputBaseBinary();
        String binDec = dec.binaryToDecimal(tmp);
        String binHex = hex.decimalToHexadecimal(binDec);
        vie.display(binHex);
    }

    public void handleDecToBin(){
        String tmp = vie.inputBaseDecimal();
        String decBin = bin.decimalToBinary(tmp);
        vie.display(decBin);
    }

    public void handleDecToDec(){
        String tmp = vie.inputBaseDecimal();
        vie.display(tmp);
    }

    public void handleDecToHex(){
        String tmp = vie.inputBaseDecimal();
        String decHex = hex.decimalToHexadecimal(tmp);
        vie.display(decHex);
    }

    public void handleHexToBin(){
        String tmp = vie.inputBaseHexadecimal();
        String hexDec = dec.hexadecimalToDecimal(tmp);
        String hexBin = bin.decimalToBinary(hexDec);
        vie.display(hexBin);
    }

    public void handleHexToDec(){
        String tmp = vie.inputBaseHexadecimal();
        String hexDec = dec.hexadecimalToDecimal(tmp);
        vie.display(hexDec);
    }

    public void handleHexToHex(){
        String tmp = vie.inputBaseHexadecimal();
        vie.display(tmp);
    }
}
