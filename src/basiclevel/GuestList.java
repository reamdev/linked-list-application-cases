/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basiclevel;

/**
 *
 * @author ream_
 */
public class GuestList {
    // Clase Nodo para la lista simplemente enlazada
    static class Node {
        String name;
        Node next;

        Node(String name) {
            this.name = name;
            this.next = null;
        }
    }

    Node head;

    // Agregar un invitado al final
    public void addGuest(String name) {
        Node newNode = new Node(name);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Verificar si un invitado está en la lista
    public boolean isInvited(String name) {
        Node current = head;
        while (current != null) {
            if (current.name.equals(name)) return true;
            current = current.next;
        }
        return false;
    }

    // Mostrar lista de invitados
    public void showGuests() {
        Node current = head;
        if (current == null) {
            System.out.println("No hay invitados.");
            return;
        }
        System.out.println("\nLista de invitados:");
        while (current != null) {
            System.out.print(current.name + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        GuestList guests = new GuestList();
        guests.addGuest("Ana");
        guests.addGuest("Bob");
        guests.showGuests();
        System.out.println("¿Está Clara invitada? " + guests.isInvited("Clara"));
        System.out.println("¿Está Ana invitada? " + guests.isInvited("Ana"));
    }
}
