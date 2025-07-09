/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package middlelevel;

/**
 *
 * @author ream_
 */
public class TutorialInteractivo {
    static class Paso { // Nodo
        int numero;
        boolean completado;
        Paso siguiente;

        Paso(int numero, boolean completado) {
            this.numero = numero;
            this.completado = completado;
            this.siguiente = null;
        }
    }

    static class Tutorial { // Lista Enlazada
        Paso cabeza;

        // Agregar un paso al final
        public void agregarPaso(int numero, boolean completado) {
            Paso nuevoPaso = new Paso(numero, completado);
            if (cabeza == null) {
                cabeza = nuevoPaso;
                return;
            }
            Paso actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoPaso;
        }

        // Dividir la lista en pasos completados y no completados
        public Tutorial[] dividirPorCompletado() {
            Tutorial completados = new Tutorial();
            Tutorial noCompletados = new Tutorial();
            Paso actual = cabeza;

            while (actual != null) {
                Paso siguiente = actual.siguiente;
                actual.siguiente = null; // Desconectar
                if (actual.completado) {
                    completados.agregarPaso(actual.numero, actual.completado);
                } else {
                    noCompletados.agregarPaso(actual.numero, actual.completado);
                }
                actual = siguiente;
            }
            cabeza = null; // La lista original se vacía
            return new Tutorial[]{completados, noCompletados};
        }

        // Calcular porcentaje de pasos completados
        public double porcentajeCompletado() {
            int total = 0;
            int completados = 0;
            Paso actual = cabeza;
            while (actual != null) {
                total++;
                if (actual.completado) completados++;
                actual = actual.siguiente;
            }
            return total == 0 ? 0 : (completados * 100.0) / total;
        }

        // Mostrar pasos
        public void mostrarPasos() {
            Paso actual = cabeza;
            if (actual == null) {
                System.out.println("No hay pasos.");
                return;
            }
            while (actual != null) {
                System.out.println("Paso: " + actual.numero + ", Completado: " + actual.completado);
                actual = actual.siguiente;
            }
        }
    }

    public static void main(String[] args) {
        Tutorial tutorial = new Tutorial();
        tutorial.agregarPaso(1, true);
        tutorial.agregarPaso(2, false);
        tutorial.agregarPaso(3, true);
        tutorial.agregarPaso(4, false);
        System.out.println("Pasos del tutorial:");
        tutorial.mostrarPasos();
        System.out.println("Porcentaje completado: " + tutorial.porcentajeCompletado() + "%");
        System.out.println("Dividiendo por completado...");
        Tutorial[] divididas = tutorial.dividirPorCompletado();
        System.out.println("Pasos completados:");
        divididas[0].mostrarPasos();
        System.out.println("Pasos no completados:");
        divididas[1].mostrarPasos();
    }
}
