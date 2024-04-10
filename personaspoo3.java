
package CLASESYOBJETOS;

public class Persona
{
    //atributos
    String nombre;
    int edad;
    String direccion;
    String barrio;
    String localidad;
            
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String direccion) {
        this.direccion = direccion;
    }

    public Persona(String barrio, String localidad) {
        this.barrio = barrio;
        this.localidad = localidad;
    }
    
    
    public void correr()
    {
        System.out.println("soy "+nombre+",tengo "+edad+ " años y estoy corriendo una maraton");
        
    }
    public void correr(int km)
    {
        System.out.println("he corrido " +km+ " y vivo en la "+direccion);
        
    }

   
    public void correr(String localidad)
    {
        System.out.println("vivo en el " +barrio+ " en la localidad numero" +localidad);
        
    }
    
}
