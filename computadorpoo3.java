
package CLASESYOBJETOS;

public class COMPUTADOR 

{
    //atributos
    String monitor;
    String teclado;
    String mouse;
    String torre;
    String marca;
    String procesador;
    String pulgadas;
    String discoduro;
    
    
    //metodo constructor
    public COMPUTADOR(String monitor,String teclado, String mouse ,String torre)
    {
        this.monitor= marca;
        this.monitor= pulgadas;
        this.mouse= marca;
        this.teclado= marca;
        this.torre=discoduro;
        this.torre=marca;
        this.torre=procesador;
        
                
        
    }
    
    public void mostrardatos ()
    {
        System.out.println("la marca del monitor es: "+monitor+marca);
        System.out.println("Las pulgadas del monitor: "+monitor+pulgadas);
        System.out.println("la marca del teclado es: "+teclado+marca);
        System.out.println("la marca del mouse es : "+mouse+marca);
        System.out.println("la marca de la torre es: "+torre+marca);
        System.out.println("el proc de la torre es: "+torre+procesador);
        System.out.println("el disco duro de la torre es: "+torre+discoduro);
        
    }
   
}
