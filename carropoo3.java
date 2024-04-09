
package ClasesyObjetosss;

public class carro 
{
    //atributos
    String marca;
    double km;
    double cilindraje;
    String color;
    private String audi;
    
    //metodo constructivo
    public carro (String marca,double km,double cilindraje,String color)
    {
        this.marca="ford";
        this.km= (int) 10.000;
        this.cilindraje=(float) 1.0;
        this.color="negro";
        
    }
    public void mostrardatos(){
        System.out.println("la marca de carro es: "+marca);
        System.out.println("el km del carro es: "+km);
        System.out.println("el cilindraje del carro es: "+cilindraje);
        System.out.println("el color del carro es: "+color);
    }
    
}
