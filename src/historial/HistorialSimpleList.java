/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package historial;

import simplelistcases.structure.Node;
import simplelistcases.structure.SimpleList;

/**
 *
 * @author ream_
 */
public class HistorialSimpleList extends SimpleList<String>{
    public void showHistory() {
        Node current = this.head;
        System.out.println("Historial de Acciones");
        while (current != null) {
            System.out.println("- " + current.getData());
            current = current.next;
        }
    }
    
    public String getLastAction() {
        return this.tail != null ? this.tail.getData() : "Sin acciones realizadas";
    }
}
