/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinestore;

import simplelistcases.structure.Node;
import simplelistcases.structure.SimpleList;

/**
 *
 * @author ream_
 */
public class CategoryList extends SimpleList<Category> {
    public void addCategory(String name, int numProductos) {
        Node node = new Node(new Category(name, numProductos));
        if (this.head == null) {
            this.head = node;
            return;
        }
        
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = node;
    }
    
    public CategoryList filtrarPorProductos(int minimoProductos) {
        CategoryList filtered = new CategoryList();
        Node current = head;
        while (current != null) {
            Category data = (Category) current.getData();
            if (data.numProductos > minimoProductos) {
                filtered.addCategory(data.name, data.numProductos);
            }
            current = current.next;
        }
        return filtered;
    }
}
