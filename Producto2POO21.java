
package PRODUCTO;

public class Producto2 
{
    public static void main (String []args )
    {
        Producto objeto1 = new Producto();
        
        objeto1.setCodigo("105540");
        System.out.println("el codigo del producto es: "+objeto1.getCodigo());
        
        objeto1.setDescripcion("bolso");
        System.out.println("la descripcion del producto es: "+objeto1.getDescripcion());
        
        objeto1.setPrecio(30000);
        System.out.println("el precio del producto es: "+objeto1.getPrecio());
       
    
    }
    
}
