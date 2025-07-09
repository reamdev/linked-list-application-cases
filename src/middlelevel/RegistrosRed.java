/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package middlelevel;

/**
 *
 * @author ream_
 */
public class RegistrosRed {
    static class Evento { // Nodo
        String tipo;
        String timestamp;
        Evento siguiente;

        Evento(String tipo, String timestamp) {
            this.tipo = tipo;
            this.timestamp = timestamp;
            this.siguiente = null;
        }
    }

    static class Registro { // Lista Simple
        Evento cabeza;

        // Agregar un evento al final
        public void agregarEvento(String tipo, String timestamp) {
            Evento nuevoEvento = new Evento(tipo, timestamp);
            if (cabeza == null) {
                cabeza = nuevoEvento;
                return;
            }
            Evento actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoEvento;
        }

        // Calcular frecuencia de un tipo de evento
        public int calcularFrecuencia(String tipo) {
            int contador = 0;
            Evento actual = cabeza;
            while (actual != null) {
                if (actual.tipo.equals(tipo)) {
                    contador++;
                }
                actual = actual.siguiente;
            }
            return contador;
        }

        // Fusionar dos listas de eventos manteniendo el orden cronológico
        public static Registro fusionarListas(Registro lista1, Registro lista2) {
            Registro fusionada = new Registro();
            Evento dummy = new Evento("", "");
            Evento actual = dummy;
            Evento p1 = lista1.cabeza;
            Evento p2 = lista2.cabeza;

            while (p1 != null && p2 != null) {
                if (p1.timestamp.compareTo(p2.timestamp) <= 0) {
                    actual.siguiente = new Evento(p1.tipo, p1.timestamp);
                    p1 = p1.siguiente;
                } else {
                    actual.siguiente = new Evento(p2.tipo, p2.timestamp);
                    p2 = p2.siguiente;
                }
                actual = actual.siguiente;
            }

            while (p1 != null) {
                actual.siguiente = new Evento(p1.tipo, p1.timestamp);
                actual = actual.siguiente;
                p1 = p1.siguiente;
            }
            while (p2 != null) {
                actual.siguiente = new Evento(p2.tipo, p2.timestamp);
                actual = actual.siguiente;
                p2 = p2.siguiente;
            }

            fusionada.cabeza = dummy.siguiente;
            return fusionada;
        }

        // Mostrar eventos
        public void mostrarEventos() {
            Evento actual = cabeza;
            if (actual == null) {
                System.out.println("No hay eventos.");
                return;
            }
            while (actual != null) {
                System.out.println("Tipo: " + actual.tipo + ", Timestamp: " + actual.timestamp);
                actual = actual.siguiente;
            }
        }
    }

    public static void main(String[] args) {
        Registro lista1 = new Registro();
        lista1.agregarEvento("Conexión", "2025-07-08 10:00");
        lista1.agregarEvento("Error", "2025-07-08 10:05");
        Registro lista2 = new Registro();
        lista2.agregarEvento("Conexión", "2025-07-08 10:02");
        lista2.agregarEvento("Error", "2025-07-08 10:06");
        System.out.println("Eventos servidor 1:");
        lista1.mostrarEventos();
        System.out.println("Frecuencia de errores: " + lista1.calcularFrecuencia("Error"));
        System.out.println("Eventos servidor 2:");
        lista2.mostrarEventos();
        System.out.println("Fusionando listas...");
        Registro fusionada = Registro.fusionarListas(lista1, lista2);
        System.out.println("Eventos fusionados:");
        fusionada.mostrarEventos();
    }
}
