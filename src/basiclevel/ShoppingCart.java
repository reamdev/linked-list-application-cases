/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basiclevel;

/**
 *
 * @author ream_
 */
public class ShoppingCart {
    // Clase Nodo para la lista simplemente enlazada
    static class Node {
        String item;
        Node next;

        Node(String item) {
            this.item = item;
            this.next = null;
        }
    }

    Node head;

    // Agregar un producto al carrito
    public void addItem(String item) {
        Node newNode = new Node(item);
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

    // Eliminar un producto por nombre
    public boolean removeItem(String item) {
        if (head == null) return false;
        if (head.item.equals(item)) {
            head = head.next;
            return true;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.item.equals(item)) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Mostrar productos en el carrito
    public void showCart() {
        Node current = head;
        if (current == null) {
            System.out.println("El carrito está vacío.");
            return;
        }
        System.out.println("Productos en el carrito:");
        while (current != null) {
            System.out.print(current.item + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Camisa");
        cart.addItem("Zapatos");
        cart.showCart();
        System.out.println("Eliminando 'Camisa' del carrito...");
        cart.removeItem("Camisa");
        cart.showCart();
    }    
}
