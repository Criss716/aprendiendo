// Se piden 3 numeros y se dice cual es el menor y mayor de los 3
import java.util.Scanner;
public class condicionales {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a,b,c;
        System.out.println("Ingresa 3 numeros");
        a = leer.nextInt();
        b = leer.nextInt();
        c = leer.nextInt();
        if (a != b && a != c && b != c) {
            if (a > b) {
                if (a < c) {
                    System.out.println("El numero mayor es: " +a);
                    
                }
                else{
                    System.out.println("El numero mayor es: "+c);
                }
            }
            else{
                if (b > c) {
                    System.out.println("En numero mayor es: "+b);
                    
                }
                else{
                    System.out.println("El numero mayor es: "+c);
                } 
            }
            
         }    
        
        else {
        System.out.println("los numeros deben ser diferentes");
      }

    
     }
}