/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayorque;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class MayorQue {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner teclado= new Scanner (System.in);
        System.out.println("Introduce dos numeros");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        
      
        
        if ( num1>num2)
            System.out.println(+num1+" es mayor que "+num2);
        else 
            System.out.println(+num2+ "es mayor que  "+num1);
        
        
    }
    
}
