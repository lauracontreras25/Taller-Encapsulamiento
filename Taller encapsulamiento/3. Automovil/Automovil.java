//Laura Contreras
//08/04/2024
//Programa para conocer el modelo, la marca y la velocidad de un automovil
package automovil;

public class Automovil {
    private String modelo;
    private String marca;
    private int velocidadActual;

    public Automovil(String modelo, String marca, int velocidadActual) {
        this.modelo = modelo;
        this.marca = marca;
        this.velocidadActual = velocidadActual;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

   public void acelerar (int aumento){
       this.velocidadActual += aumento;
   }
   
   public void frenar (int disminucion){
       this.velocidadActual -= disminucion;
   }
  
}
