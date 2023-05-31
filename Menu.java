
package taller.sipt.struss;

import java.util.Scanner;

/**
 *
 * @author Geoffrey Struss
 */
public class Menu {
   
    int selection;
    String lugardeBus;
    private Scanner input = new Scanner(System.in);
   
    public void menu(){
       
        System.out.println("-- Por favor seleccione su opcion a realizar--");
        System.out.println(
        "Nuestro menu: \n" +
        "  1) Digite la ruta de bus sobre la que desea conocer las parada \n" +
        "  2) Conocer rutas que funcionan en feriados \n"
    );
       
        int selection = input.nextInt();
           input.nextLine();
           
           
        switch (selection) {
            case 1:
              consultarPuntodeBus();
              break;
            case 2:
              consultarPuntosFestivos();
              break;
            default:
              System.out.println("Invalid selection.");
              break;
            }
    }
   
    void consultarPuntodeBus()
    {
        System.out.println ("Por favor introduzca el numero de ruta de un Bus: \n G11 \n H13");
        String Bus = "";
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        Bus = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
        System.out.println ("El numero de ruta del Bus que usted ha ingresado es: \"" + Bus +"\"");
       
        Paradas puntodeBus = new Paradas();
        lugardeBus = puntodeBus.sitiodeBus(Bus);
       
        System.out.println("Las paradas del Bus son: \n" + lugardeBus);
       
    }
   
       void consultarPuntosFestivos ()
    {
            System.out.println ("El Bus que funciona en feriados es: B11");
    }
   
   
}
