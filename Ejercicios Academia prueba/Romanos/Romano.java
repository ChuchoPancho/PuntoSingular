package morse;

import java.util.Scanner;

public class Romano 
{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int numero = input.nextInt();
        String romanos="";
        int reglas[]={1000,900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String simbolo[]={"M","CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        for(int x=0; x <reglas.length; x++){
            if(numero==reglas[x]){
                romanos=romanos + simbolo[x];
            }
            while(numero<reglas[x] && numero>reglas[x+1]){
                
                romanos=romanos + simbolo[x+1];
                numero = numero - reglas[x+1];
                
            }
            }
        System.out.print ( "\nIgual a " + romanos +"\n");
            }
            
        }
 
       