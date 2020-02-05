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
public abstract class empleado {
    
    private String nombre;
    private String apellido;
    private int CI;

    public empleado() {
    }
    
    public empleado(String nombre, String apellido, int CI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.CI = CI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCI() {
        return CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public abstract Double calcularIngresos();
    public abstract Double calcularIngresos2();
    public abstract Double calcularIngresos3();
    
}
