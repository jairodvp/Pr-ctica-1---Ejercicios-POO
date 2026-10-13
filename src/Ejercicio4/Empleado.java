/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author jairo
 */
public class Empleado {
    //atributos
    String nombre;
    int horas_extras;
    int salario;

    int total_salario;
    public Empleado() {
    }

    public Empleado(String nombre, int horas_extras) {
        this.nombre = nombre;
        this.horas_extras = horas_extras;
        this.salario = 460;
    }
   
    //metodos
    public void calcularSalarioTotal(){
        total_salario = salario+(horas_extras*10);
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Salario Base: "+salario);
        System.out.println("Horas extra: "+horas_extras);
        System.out.println("Salario total: "+total_salario);
    }
    
}
