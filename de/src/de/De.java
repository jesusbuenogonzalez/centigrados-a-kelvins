/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de;

import java.util.Scanner;

/**
 *
 * @author DAM105
 */
public class De {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner (System.in);
        int centi=0,kelvin=0,opc;
        do{
            System.out.println("introduce una temperatura en grados centigrados: ");
            centi=teclado.nextInt();
            kelvin=centi+273;
            System.out.println("Su temperatura en kelvin es: "+kelvin);
            System.out.println("Desea introducir otra temperatura?\n1=Si\n2=No");
            opc=teclado.nextInt();
        }while(opc!=2);
    }
    
}
