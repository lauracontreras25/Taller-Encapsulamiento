//Laura Contreras
//08/04/2024
//Programa que imprime informacion de un empleado como su nombre, su salario, su fecha de contratacion y un aumento de salario.
package empleado;

import java.util.Date;

public class Empleado {
    private String nombre;
    private int salario;
    private Date fechaContratacion;

    public Empleado(String nombre, int salario, Date fechaContratacion) {
        this.nombre = nombre;
        this.salario = salario;
        this.fechaContratacion = fechaContratacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }
    
    public void aumentoSalario (double aumento){
        salario += aumento;
    }
    
}
