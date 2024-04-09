
package circulo;


public class CirculoMain {

    public static void main(String[] args) {
       
        Circulo circulo = new Circulo (5);
        System.out.println("Radio del circulo: " + circulo.getRadio());
        System.out.println("Area del circulo: " + circulo.getArea()); 
    }
    
}
