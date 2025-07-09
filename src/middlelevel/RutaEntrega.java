/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package middlelevel;

/**
 *
 * @author ream_
 */
public class RutaEntrega {
    static class Parada {
        int id;
        String direccion;
        Parada siguiente;

        Parada(int id, String direccion) {
            this.id = id;
            this.direccion = direccion;
            this.siguiente = null;
        }
    }

    static class Ruta {
        Parada cabeza;

        // Agregar una parada al final
        public void agregarParada(int id, String direccion) {
            Parada nuevaParada = new Parada(id, direccion);
            if (cabeza == null) {
                cabeza = nuevaParada;
                return;
            }
            Parada actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevaParada;
        }

        // Invertir la ruta
        public void invertirRuta() {
            Parada anterior = null;
            Parada actual = cabeza;
            Parada siguiente = null;
            while (actual != null) {
                siguiente = actual.siguiente;
                actual.siguiente = anterior;
                anterior = actual;
                actual = siguiente;
            }
            cabeza = anterior;
        }

        // Mostrar ruta
        public void mostrarRuta() {
            Parada actual = cabeza;
            if (actual == null) {
                System.out.println("Ruta vacía.");
                return;
            }
            while (actual != null) {
                System.out.println("ID: " + actual.id + ", Dirección: " + actual.direccion);
                actual = actual.siguiente;
            }
        }
    }

    public static void main(String[] args) {
        Ruta ruta = new Ruta();
        ruta.agregarParada(1, "Calle A");
        ruta.agregarParada(2, "Calle B");
        ruta.agregarParada(3, "Calle C");
        System.out.println("Ruta original:");
        ruta.mostrarRuta();
        System.out.println("Invirtiendo ruta...");
        ruta.invertirRuta();
        System.out.println("Ruta invertida:");
        ruta.mostrarRuta();
    }
}
