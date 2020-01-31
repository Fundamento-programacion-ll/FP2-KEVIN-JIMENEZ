/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author SISTEMAS CORP
 */
public class perro extends animal{
    protected float estatura;

    public perro(float estatura) {
        this.estatura = estatura;
    }

    public perro(float estatura, String especie, String genero, String nombre) {
        super(especie, genero, nombre);
        this.estatura = estatura;
    }
    
    

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }
    
    public int sumaPerro(int n1, int n2){
        return suma(n1, n2);
    }
    
    public void datosPerro(){        
        System.out.println("nombre: " + getNombre() + " edad: " +getEdad() + " estatura: " +getEstatura());
    }
    
    
    /*
    
    clase se llame dimensiones
        lados
        base
        altura    
   
    - triangulo // area, volumen, perimetro
    - cuadrado
    - circulo // circunferencia    
        
    */
    
    
}
