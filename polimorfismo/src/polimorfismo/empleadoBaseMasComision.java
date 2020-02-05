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
public class empleadoBaseMasComision extends empleadoPorComision {

    private double salarioBase;

    public empleadoBaseMasComision(double salarioBase, double ventasBrutas, double tarifaComision, String nombre, String apellido, int CI) {
        super(ventasBrutas, tarifaComision, nombre, apellido, CI);
        setSalarioBase(salarioBase);
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase > 0 ? salarioBase : 0;
    }
    
    public double ingresos(){
        return salarioBase * super.calcularIngresos();
    }

    @Override
    public String toString() {        
        return "Empleado base mas comision\n"
+ "nombre: "+ getNombre()+" apellido: "+ getApellido()+ " salario semanal: "+ingresos();
    }
    
    

}
