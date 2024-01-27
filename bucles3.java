 import java.util.Scanner;

 public class bucles3 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero para calcular su factorial: ");

        Scanner datosp = new Scanner(System.in);

        int num = datosp.nextInt();
        long factorial = 1;

        if (num < 0) {
            System.out.println("El numero debe ser positivo. ");
            
        }
        else{
            
            for (int i = 1; i <= num; i++) {
                factorial *= i;
                
            }
            System.out.println(factorial);
        }
        datosp.close();

     }
    }
 

