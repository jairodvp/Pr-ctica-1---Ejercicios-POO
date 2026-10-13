/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author jairo
 */
public class Libro {
    //atributos
        String titulo, autor;
        int paginas;
        String estado;

        public Libro() {
        }

        public Libro(String titulo, String autor, int paginas) {
            this.titulo = titulo;
            this.autor = autor;
            this.paginas = paginas;
            this.estado = "disponible";
        }

        //metodos

        public void prestar(){
            if (estado.equalsIgnoreCase("disponible")) {
                estado = "prestado";
                System.out.println("El libro ahora esta prestado");
            }else{
                System.out.println("El Libro se encuentra prestado");
            }
        }
        public void devolver(){
            if(estado.equalsIgnoreCase("prestado")){
                estado = "disponible";
                System.out.println("El libro ahora esta disponible");
            }else{
                System.out.println("El libro se encuentra disponible");
            }
        }
        public void mostrarinfo(){
            System.out.println("Titulo: "+titulo);
            System.out.println("Autor: "+autor);
            System.out.println("Paginas: "+paginas);   
            System.out.println("Estado: "+estado);
        }



    
    
    
}
