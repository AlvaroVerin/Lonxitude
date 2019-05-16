
package lonxitudes;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lonxitudes {
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        String resp;
        String [] opciones = {"KMS", "Millas", "Pulgadas", "Salir"};
        resp = (String) JOptionPane.showInputDialog(null, opciones);
        do {
            switch (resp) {
                /*case "KMS":
                  kmamillas(leer.nextDouble());
                  break;*/
            
            }
            
        } while (!resp.equalsIgnoreCase("Salir"));
        
      
    }
    public void kmamillas (double valor){
            double resul;
            resul = valor * 0.6214;
            System.out.println("El resultado es: "+resul);
     }
  
    
}
