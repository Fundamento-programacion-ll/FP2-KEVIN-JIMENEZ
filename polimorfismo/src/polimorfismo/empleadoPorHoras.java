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
public class empleadoPorHoras extends empleado {

    private double sueldo;
    private double horas;

    public empleadoPorHoras() {
    }

    public empleadoPorHoras(double sueldo, double horas, String nombre, String apellido, int CI) {
        super(nombre, apellido, CI);
        setHoras(horas);
        setSueldo(sueldo);
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo < 0.0 ? 0.0 : sueldo;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = ((horas > 0 && horas <= 168) ? horas : 0);
    }

    @Override
    public Double calcularIngresos() {
        return horas * sueldo;
    }
    
    @Override
    public String toString() {        
        return "Empleado por horas \n"
+ "nombre: "+ getNombre()+" apellido: "+ getApellido()+ " salario semanal: "+calcularIngresos();
    }

}
