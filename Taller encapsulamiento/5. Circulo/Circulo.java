//Laura Contreras
//08/04/2024
//Programa que calculo el area de un circulo apartir de su radio
package circulo;

public class Circulo {
    private double radio;
    private double area;

    public Circulo(double radio) {
        this.radio = radio;
        calcularArea();
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return area;
    }
    
   private void calcularArea(){
       this.area = Math.PI * Math.pow(radio, 2);
   }
}
