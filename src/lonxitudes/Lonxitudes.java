
package lonxitudes;

import java.util.Scanner;

public class Lonxitudes {
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        int menu = 0;
        double km, millas, pulgada;
        do {
        System.out.println("");
        System.out.println("Que opcion quieres?");
        System.out.println("1. km a millas");
               System.out.println("2. millas a km");
               System.out.println("3. millas a pulgadas");
               System.out.println("4. pulgadas a millas");
               System.out.println("5. salir del programa");
               menu=leer.nextInt();
               
            
        if (menu==1) {
            System.out.println("Cuantos km son?");
            km=leer.nextInt();
            millas= km*0.6214;
            System.out.println("Son "+millas+" millas");
        }
        if (menu==2) {
          System.out.println("Cuantas millas son?");
            millas=leer.nextInt();
            km= millas*1.60934;
            System.out.println("Son "+km+" km");
        }
        if (menu==3) {
            
        }
        if (menu==4) {
            
        }
         } while (menu>=1 && menu<5);   
        System.out.println("Saliendo del programa");
    }
    
}
