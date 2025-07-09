/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basiclevel;

/**
 *
 * @author ream_
 */
public class ToDoList {
    // Clase Nodo para la lista simplemente enlazada
    static class Node {
        String task;
        Node next;

        Node(String task) {
            this.task = task;
            this.next = null;
        }
    }

    Node head;

    // Agregar una tarea al final
    public void addTask(String task) {
        Node newNode = new Node(task);
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

    // Eliminar una tarea por nombre
    public boolean completeTask(String task) {
        if (head == null) return false;
        if (head.task.equals(task)) {
            head = head.next;
            return true;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.task.equals(task)) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Mostrar tareas pendientes
    public void showTasks() {
        Node current = head;
        if (current == null) {
            System.out.println("No hay tareas pendientes.");
            return;
        }

        System.out.println("\nTareas pendientes:");
        System.out.println("====================");

        while (current != null) {
            System.out.print(current.task + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ToDoList todo = new ToDoList();
        todo.addTask("Comprar leche");
        todo.addTask("Llamar al cliente");
        todo.showTasks();
        System.out.println("Completando tarea 'Comprar leche'...");
        todo.completeTask("Comprar leche");
        todo.showTasks();
    }
}
