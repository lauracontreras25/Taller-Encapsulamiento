
package empleado;

import java.util.Date;

public class EmpleadoMain {

    public static void main(String[] args) {
       Empleado empleado = new Empleado ("Andrea", 1000000, new Date());
       
        System.out.println("Nombre del empleado: " + empleado.getNombre());
        System.out.println("Salario actual del empleado: " + empleado.getSalario());
        System.out.println("Fecha de contratacion: " + empleado.getFechaContratacion());
        
        empleado.aumentoSalario (500000);
        
        System.out.println("Salario mas aumento: " + empleado.getSalario());
    }
    
}
