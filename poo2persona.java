
package CLASESYOBJETOS;

public class Persona
{
    //atributos
    String nombre;
    int edad;
    String carrera;
    String telefono;
    String direccion;
    
    //metodo constructor
    public Persona (String nombre, int edad,String carrera, String telefono, String direccion)
    {
            this.nombre = nombre;
            this.edad= edad;
            this.carrera = carrera;
            this.telefono = telefono;
            this.direccion = direccion;
    }
    
    public void mostrardatos ()
    {
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
        System.out.println("La carrera es: "+carrera);
        System.out.println("El telefono es: "+telefono);
        System.out.println("La direccion es: "+direccion);
        
    }
}
