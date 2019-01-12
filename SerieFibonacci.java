/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriefibonacci;
 import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintStream;
/**
 *
 * @author danodine
 */
public class SerieFibonacci {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args)throws FileNotFoundException {
    
          PrintStream Fib = new PrintStream("Fibonacci.txt");
          
        System.out.println ("Cálculo de Serie Fibonacci");
        System.out.print ("Introduzca valor de n para serie numérica: ");
        int datoN = 0;
        Scanner entradaTeclado = new Scanner (System.in);
        datoN = Integer.parseInt(entradaTeclado.nextLine());
        int [] serieFibonacci;
        Fibonacci f = new Fibonacci();
        serieFibonacci = f.hallarSerieFibonacci(datoN);
        for (int i=0; i<serieFibonacci.length; i++) {
            System.out.print (serieFibonacci[i]+" - ");
            
             Fib.print(serieFibonacci[i]+" - "); 
        }
      
    }
}
    

    
    

