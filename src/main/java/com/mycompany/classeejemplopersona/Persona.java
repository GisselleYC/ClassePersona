
/**
 *
 * @author gisse
 */
public class Persona {
    private String nombre;
    private int edad;
    private double estatura ;
    private char sexo ;
    
    // Constructor sin parametros 
    public Persona () 
    {
        this.nombre = "juan";
        this.edad=23;
        this.estatura=1.7;
        this.sexo= 'm';
    }
    //Cosntrucot con parametros
    public Persona (String nombre , int edad, double estatura , char sexo )
    {
        this.nombre = nombre ; 
        this.edad=edad;
        this.estatura=estatura;
        this.sexo=sexo;
        
     
        
     //accesadores ---> accesan al ultimo valor de la variable 
      
     
    }
    public String getNombre()
    {
        return nombre;
    }
    public int getEdad ()
    {
        return edad;
    }
    public double getEstatura ()
    {
        return estatura;
    }
    public char getSexo()
    {
        return sexo;
    }
    public void imprimirPersona()
    {   System.out.println("***********DATOS DE PERSONA***********");
        System.out.println ("Su nombre es :" + this.getNombre());
        System.out.println("Su edad es :"+ this.getEdad());
        System.out.println("Su estatura es:"+this.getEstatura());
        if (this.getSexo()=='m') {
        }
        else 
        {
            System.out.println("su sexo es femenino");
        }
    
        System.out.println("Su sexo es :" + this.sexo);
    }
    }
    

