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
public class empleadoPorComision extends empleado {

    private double ventasBrutas;
    private double tarifaComision;

    public empleadoPorComision() {
    }

    public empleadoPorComision(double ventasBrutas, double tarifaComision, String nombre, String apellido, int CI) {
        super(nombre, apellido, CI);
        setVentasBrutas(ventasBrutas);
        setTarifaComision(tarifaComision);
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = ventasBrutas < 0.0 ? 0.0 : ventasBrutas;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public void setTarifaComision(double tarifaComision) {          
        this.tarifaComision = ((tarifaComision >= 0.0 && tarifaComision <= 1) ? tarifaComision : 0.0);
    }
    
    @Override
    public Double calcularIngresos() {  
        return tarifaComision * ventasBrutas;
    }

    @Override
    public String toString() {        
        return "Empleado por comision \n"
+ "nombre: "+ getNombre()+" apellido: "+ getApellido()+ " salario semanal: "+calcularIngresos();
    }
    
    

    

}
