/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio4;
import java.util.Scanner;
/**
 *
 * @author jairo
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Cuantos empleados vas a ingresar: ");
        n = sc.nextInt();
        sc.nextLine();
        Empleado[] empleados = new Empleado[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Empleado "+(i+1));
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            
            System.out.print("Horas extras: ");
            int horas_extras = sc.nextInt();
            sc.nextLine();
            empleados[i] = new Empleado(nombre, horas_extras);
            
        }
        for (int i = 0; i < n; i++) {
            empleados[i].calcularSalarioTotal();       
        }
        for (int i = 0; i < n; i++) {
            System.out.println("====  Empleado "+(i+1)+" ====");
            empleados[i].mostrarDatos();
        }       
    }
}
