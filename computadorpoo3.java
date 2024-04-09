
package CLASESYOBJETOS;

public class COMPUTADOR 

{
    //atributos

    String marca1;
    String marca2;
    String marca3;
    String marca4;
    String procesador;
    String pulgadas;
    String discoduro;
    
    
    //metodo constructor
    public COMPUTADOR (String marca1,String marca2,String marca3,String marca4,String procesador,String pulgadas,String discoduro)
    {
        this.marca1= "Asus";
        this.pulgadas="17";
        this.marca2= "Cyrbetel";
        this.marca3= "Corsair";
        this.discoduro="SSD";
        this.marca4="intel";
        this.procesador="celeron";
        
                
        
    }
    
    public void mostrardatos ()
    {
        System.out.println("la marca del monitor es: "+marca1);
        System.out.println("Las pulgadas del monitor: "+pulgadas);
        System.out.println("la marca del teclado es: "+marca2);
        System.out.println("la marca del mouse es : "+marca3);
        System.out.println("la marca de la torre es: "+marca4);
        System.out.println("el proc de la torre es: "+procesador);
        System.out.println("el disco duro de la torre es: "+discoduro);
        
    }
   
}
