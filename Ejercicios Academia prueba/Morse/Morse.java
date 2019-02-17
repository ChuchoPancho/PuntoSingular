/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morse;

import java.util.Scanner;

/**
 *
 * @author chucho
 */
public class Morse {
    public static void main(String[] args) {
        char [] letras = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', ' ' };
        String [] morse = { ".-" , "-..." , "-.-." , "-.." , "." , "..-." , "--." , "...." , ".." , ".---" , "-.-" , ".-.." , "--" , "-." , "---" , ".--." , "--.-" ,  ".-." , "..." , "-" , "..-" , "...-" , ".--" , "-..-" , "-.--" , "--.." , ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", " " };
        Scanner input = new Scanner (System.in);
                System.out.println( "Ingrese codigo morse." );
                String codigom = input.nextLine();
                String[] caracteres = codigom.split(" ");
                for(int h = 0;h < caracteres.length;h++){
                    for(int i = 0;i < morse.length;i++){
                        if(caracteres[h].equals(morse[i])){
                            System.out.print(letras[i] + " ");
                        }
                    }
                }
                System.out.println("\nIngrese una palabra o frase.");
                String texto = input.nextLine();
                texto = texto.toLowerCase ();
                for ( int x = 0; x < texto.length(); x++ )
                {
                    for ( int y = 0; y < letras.length; y++ )
                    {
                        if ( letras [ y ] == texto.charAt ( x ) ){
                            System.out.print ( morse [ y ] + " " );
                        }
                    }
                }
        }
    }    

