/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author jairo
 */
public class Vehiculo {
    //atributos
    String marca, modelo, estado;
    int ano_fab;
    boolean matriculado;
    
    
    

    public Vehiculo() {
    }
        
    public Vehiculo(String marca, String modelo, String estado, int ano_fab) {
        this.marca = marca;
        this.modelo = modelo;
        this.estado = estado;
        this.ano_fab = ano_fab;
        this.matriculado = false;
    }
    
    //metodos
    public void revisionVehicular(){
        if (ano_fab < 1996) {
            estado = "usado malo";
        }else if (ano_fab < 2016) {
            estado = "usado bueno";
        }else if (ano_fab < 2026 || (ano_fab < 2026 && estado.equalsIgnoreCase("nuevo"))) {
            estado = "seminuevo";
        }else{
            estado = "nuevo";
        }
    }
    
    
    public void matricular(){
        if (!estado.equalsIgnoreCase("usado malo")) {
            matriculado = true;
            System.out.println("Vehiculo matriculado");
        }else{
            System.out.println("No se puede matruicular el vehiculo");
        }
    }
    
    
    public void mostrarDatos(){
        System.out.println("== Vehiculos ==");
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Estado: "+ estado);
        System.out.println("Ano: "+ano_fab);
        System.out.println("Matriculado: "+ (matriculado ? "Si":"No"));
        
    }
}
