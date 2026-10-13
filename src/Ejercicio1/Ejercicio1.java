/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;
import java.util.Scanner;

/**
 *
 * @author jairo
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        CuentaBancaria cuenta = null;
        
        do{
            System.out.println("Mostrar Menu");
            System.out.println("1. Crear Cuenta");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Ver informacion");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opcion: ");
            op = sc.nextInt();
            sc.nextLine();

            switch(op){
                
                case 1:
                    System.out.println("== Creacion de cuenta ==");
                    System.out.print("Nombre del titular: ");
                    String nombre = sc.nextLine();
                    System.out.print("Apellido del titular: ");
                    String apellido = sc.nextLine();
                    System.out.print("Tipo de Cuenta: ");
                    String tipocuenta = sc.nextLine();
                    System.out.print("Saldo: ");
                    double saldo = sc.nextDouble();
                    sc.nextLine();
                    cuenta = new CuentaBancaria(nombre, apellido, tipocuenta, saldo);
                    break;
                    
                case 2:
                    System.out.print("Ingrese monto a depositar: ");
                    double depositar = sc.nextDouble();
                    sc.nextLine();
                    cuenta.depositar(depositar); break;
                case 3:
                    System.out.print("Ingerse el monto a retirar: ");
                    double retiro = sc.nextDouble();
                    sc.nextLine();
                    cuenta.retirar(retiro);break;
                case 4:    
                   cuenta.mostrarSaldo();break;
                
                default:
                    System.out.println("Opcion incorrecta");
                    
            }
         }while(op != 5);
        sc.close();
    }
}
