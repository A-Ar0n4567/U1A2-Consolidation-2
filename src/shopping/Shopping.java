/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shopping;
import java.util.Scanner;
/**
 *
 * @author aamir7110
 */
public class Shopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        //variable declaration
        final double USBPRICE,KEYBOARDPRICE,MICEPRICE,TAX;
        
        double nusb,nkeyboard,nmice,taxtotal,price,totalprice;
        
        USBPRICE = 19.99;
        KEYBOARDPRICE = 49.99;
        MICEPRICE = 25.99;
        TAX = 0.13;
        
        System.out.println("Enter The Number Of USB's You Purchased");
        nusb = keyedInput.nextDouble();
        System.out.println("Enter The Number Of KeyBoards You Purchased");
        nkeyboard = keyedInput.nextDouble();
        System.out.println("Enter The Number Of Mice You Purchased");
        nmice = keyedInput.nextDouble();
        
        price = USBPRICE*nusb + KEYBOARDPRICE*nkeyboard + MICEPRICE*nmice;
        
        taxtotal = TAX*price;
        
        totalprice = taxtotal + price;
        
        System.out.println("Your Total With Tax Is:$"+totalprice);
        
    }
    
}
