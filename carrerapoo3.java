
package carrera;

public class CARRERA1 
{
    String nombre;
    String apellido;
    int edad;
    int semestre;
    String carrera;

    public CARRERA1(String nombre, String apellido, int edad, int semestre, String carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.semestre = semestre;
        this.carrera = carrera;
    } 
    public void correr (){
        
    System.out.println("Soy " +nombre+ " " +apellido+
                            " tengo " +edad + " años, estudio " +carrera +
                            " y estoy en el semestre " +semestre +
                            ", pronto me graduare de " +carrera + ".");
    }
    
    
}
