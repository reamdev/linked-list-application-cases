/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simplelistcases.structure;

/**
 *
 * @author ream_
 */
public class SimpleList<T> {
    protected Node<T> head;
    protected Node<T> tail;
    
    public void addToHead(T data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        
        node.next = head;
        head = node;
    }
    
    public void addToTail(T data) {
        Node node = new Node(data);
        
        if (tail == null) {
            tail = node;
            head = node;
            return;
        }
        
        tail.next = node;
        tail = node;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        
        return count;
    }
}
