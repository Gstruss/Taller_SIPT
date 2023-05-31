
package taller.sipt.struss;

/**
 *
 * @author Geoffrey Struss
 */
public class Paradas {
    
    
    String  puntodeBus;
    
    String sitiodeBus( String Bus)
    {
        
        if (Bus.startsWith("G"))
                
                {
                   puntodeBus= "Portal Norte - Toberin - Cardio Infantil - Mazuren - Calle 146 -\n Pepe Sierra - Calle 106 - Virrey - Calle 85 - Heroes -\n Escuela Militar - Campin - Universidad Antonio Narino - Universidad Nacional - CAD -\n Paloquemao - Ricaurte (NQS) - SENA - Alqueria - Venecia - Portal del Sur";
                   
                }
        else {
            puntodeBus= "Portal Norte - Cardio Infantil - Mazuren - Calle 146 - Calle 106 -\n Calle 100 - Calle 85 - Flores - Calle 63 - AV. 39 -\n Calle 22 - Tercer Milenio - Restrepo - Calle 40 S - Portal del Tunal";
        }

        return puntodeBus;
    }
    
    
}
