
package lab4p1_rodrigovasquez;

import java.util.Scanner;
import java.util.Random; 
 
public class Lab4P1_RodrigoVasquez {

    public static void main(String[] args) {
        Scanner elProta = new Scanner(System.in);  
        int choice = 0; 
        do{
            System.out.println("1. Fallout Words \n2. Rodatcripne \n3. Alpha");
            System.out.print("¿A qué ejercicio desea ingresar? "); 
            choice = elProta.nextInt(); 
            switch(choice){
                case 1: 
                    falloutWords(); 
                    break; 
                case 2: 
                    rodatcripne(); 
                    break; 
                case 3:
                    System.out.print("Ingrese la cadena que desea evaluar: ");
                    String cadena = elProta.next(); 
                    is_alpha(cadena); 
                    break; 
                default: 
                    System.out.println("Solo se pueden ingresar números del 1-3");
                    break; 
        }
        }while(choice>0&&choice<4); 
    }
    
    public static void falloutWords(){
        Scanner gettingOverIt = new Scanner(System.in); 
        System.out.println("    Comer   Unida \n    Jugar   Venti \n    Salta   Llama \n    LLora   Eevee \n    Muere   Local");
        System.out.print("Ingrese la palabra que selecciono: ");
        String palabra = gettingOverIt.next(); 
        int max = 10; 
        int min = 1; 
        int random = new Random().nextInt((max-min)+1)+min; 
        switch(random){
            case 1:
                String caso1 = "Comer"; 
                
                break;
            case 2:
                String caso2 = "Unida";
                
                break;
            case 3: 
                String caso3 = "Jugar";
                
                break;
            case 4:
                String caso4 = "Venti";
                
                break;
            case 5: 
                String caso5 = "Salta";
                
                break;
            case 6: 
                String caso6 = "Llama"; 
                break;
            case 7: 
                
                break;
            case 8: 
                
                break; 
            case 9: 
                
                break;
            case 10: 
                
                break; 
        }
    }
    
    public static void rodatcripne(){
        Scanner gunShot = new Scanner(System.in); 
        System.out.print("Ingrese su contraseña: ");
        String password = gunShot.nextLine(); 
        String newPassword = new StringBuilder(password).reverse().toString().toLowerCase(); 
        int length = newPassword.length();  
        String newestPassword = ""; 
        for (int i = 0; i < length; i++) { 
            if(i%2!=0){ 
                int max = 9;
                int min = 0;
                int random = new Random().nextInt((max-min)+1)+min;    
                newestPassword += random;
            }else{
                newestPassword += newPassword.charAt(i); 
            }
        }
        System.out.println("Output: " + newestPassword);
    }
    
    public static void is_alpha(String cadena){
        int length = cadena.length(); 
        boolean letras = true;
        for (int i = 0; i < length; i++) {
            char verification = cadena.charAt(i); 
            int ASCII = (int) verification;  
            if((ASCII<65&&ASCII>0)||(ASCII>90&&ASCII<97)||(ASCII>122&&ASCII<256))
                letras = false; 
        }
        if(letras == true)
            System.out.println("La cadena sólo contiene letras");
        else 
            System.out.println("La cadena contiene caracteres que no son letras");
    }
}
