/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3;
import  java.util.Scanner;
/**
 *
 * @author jairo
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Libro libros[] = null;
        
        int op;
        int n = 0;
        
        
        do{
            System.out.println("------ MENU OPCIONES ------");
            System.out.println("1.Ingresar un libro");
            System.out.println("2.Prestar un libro");
            System.out.println("3.Devolver un libo");
            System.out.println("4.Mostar libros");
            System.out.println("5.Salir");
            
            System.out.print("Ingrese una opcion: ");
            op = sc.nextInt();
            sc.nextLine();     
            
            
            switch(op){
                case 1:
                    System.out.print("Cuantos libros quiere ingresar: ");
                    n = sc.nextInt();
                    sc.nextLine();
                    libros = new Libro[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Libro " + (i + 1));
                        System.out.print("Titulo: ");
                        String titulo = sc.nextLine();

                        System.out.print("Autor: ");
                        String autor = sc.nextLine();

                        System.out.print("Numero de paginas: ");
                        int paginas = sc.nextInt();
                        sc.nextLine();

                        libros[i] = new Libro(titulo, autor, paginas);
                    }
                    break;
                    
                    
                case 2:
                    System.out.print("Ingrese el nombre del libro a prestar: ");
                    String tituloprestar = sc.nextLine();
                    int i;
                    for ( i = 0; i < n; i++) {
                        if (libros[i].titulo.equalsIgnoreCase(tituloprestar)) {
                            libros[i].prestar();
                            break;
                        }
                    }
                    if (i == n) {
                        System.out.println("El libro no existe.");
                    }
                    break;
                    
                case 3:
                    System.out.print("Ingrese el nombre del libro a devolver: ");
                    String titulodevolver = sc.nextLine();
                    
                    for (i = 0; i < n; i++) {
                        if (libros[i].titulo.equalsIgnoreCase(titulodevolver)) {
                            libros[i].devolver();
                            break;
                        }
                    }
                    if (i == n) {
                        System.out.println("El libro no existe.");
                    }
                    break;
                    
                case 4:
                    for (i = 0; i < n; i++) {
                        System.out.println("== Libro "+(i+1)+" ==");
                        libros[i].mostrarinfo();                   
                    }
                    break;
                case 5:break;
                default:
                    System.out.println("Opcion incorrecta");
            }
                            
            
            
        
        }while(op != 5);
        sc.close();
    }
    
}
