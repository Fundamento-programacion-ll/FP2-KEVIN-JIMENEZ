/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author SISTEMAS CORP
 */
public class empleadoAsalariado extends empleado {

    private double salarioSemanal;

    public empleadoAsalariado(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    public empleadoAsalariado(double salarioSemanal, String nombre, String apellido, int CI) {
        super(nombre, apellido, CI);        
        setSalarioSemanal(salarioSemanal);
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal < 0.0 ? 0.0 : salarioSemanal;
    }

    @Override
    public Double calcularIngresos() {
        return this.salarioSemanal;
    }
    
    @Override
    public String toString() {        
        return "Empleado asalariado \n"
                + "nombre: "+ getNombre()+" apellido: "+ getApellido()+ " salario semanal: "+calcularIngresos();
    }
   

    
   
    
    

}
