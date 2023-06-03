/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package descifrarpalabar;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Descifrarpalabar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Ingrese una palabra encriptada: ");
        Scanner s = new Scanner(System.in);
        String palabra = s.nextLine();
        
        String[] numeros = palabra.split(" ");
        
        String salida = "";
        for(String n: numeros){
            int num = Integer.parseInt(n);
            char letra;
            if(num == 0){
                letra = 32;
            }
            else{
                letra =  (char) (num + 64);
            }
            salida += letra;
        }
        System.out.println("La palabra es: " + salida);
        
        
    }
    
    
    
}
