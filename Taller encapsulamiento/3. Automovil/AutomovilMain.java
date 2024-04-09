
package automovil;

public class AutomovilMain {

   
    public static void main(String[] args) {
        
        Automovil automovil = new Automovil("Duster", "Renautl" , 0);
        
        System.out.println("El modelo del automovil es: " + automovil.getModelo());
        System.out.println("La marca del automovil es: " + automovil.getMarca());
        System.out.println("La velocidad actual del automovil es: " + automovil.getVelocidadActual());
        
        automovil.acelerar(60);
        System.out.println("La velocidad despues de acelerar es de: " + automovil.getVelocidadActual());
        
        automovil.frenar(30);
        System.out.println("La velocidad despues de frenar es de: " + automovil.getVelocidadActual());
    } 
}
