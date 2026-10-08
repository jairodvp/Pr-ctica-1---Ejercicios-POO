/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author jairo
 */
public class CuentaBancaria {
    //
    String nombre, apellido, tipocuenta;
    double saldo;

    //CONSTRUCTORES 
    public CuentaBancaria() {
    }
    
    
    public CuentaBancaria(String nombre, String apellido, String tipocuenta, double saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipocuenta = tipocuenta;
        this.saldo = saldo;
    }
    
    
    //methodos
    public void depositar(double monto){
        saldo += monto;
        System.out.println("Deposito existoso. Nuevo saldo $"+ saldo);     
    }  
    public void retirar(double monto){
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo $"+ saldo);     
        }else{
            System.out.println("Saldo insuficiente");
        }
    
    }
    public void mostrarSaldo(){//tipo camel case
        System.out.println("==== Cuenta Bancaria ====");
        System.out.println("Nombre del titular: " + nombre + " " + apellido);
        System.out.println("Tipo de Cuenta: "+ tipocuenta);
        System.out.println("Saldo: $"+ saldo);
    }
}
