
/**
 *
 * @author gisse
 */
public class TestPersona {
    public static void main(String[] args) {
       Persona objPersona1= new Persona();
     //System.out.println("Su nombre es :"+ objPersona1.getNombre() );
     objPersona1.imprimirPersona();
     {
         Persona objPersona2= new Persona("Gisselle",31,1.7,'F');
        // System.out.println("Su nombre del objeto 2 es:"+objPersona2.getNombre ());
     objPersona2.imprimirPersona();
     }
    }
    }
