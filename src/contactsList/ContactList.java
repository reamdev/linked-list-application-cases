/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contactsList;

import simplelistcases.structure.Node;
import simplelistcases.structure.SimpleList;

/**
 *
 * @author ream_
 */
public class ContactList extends SimpleList<Contact> {

    public void addContact(String name, int notReadMessages) {
        Node<Contact> newNode = new Node<Contact>(new Contact(name, notReadMessages));
        if (this.head == null) {
            this.head = newNode;
            return;
        }
        Node<Contact> current = this.head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public ContactList[] particionarPorMensajes() {
        ContactList withMessages = new ContactList();
        ContactList notMessages = new ContactList();
        Node<Contact> current = this.head;

        while (current != null) {
            Node<Contact> next = current.next;
            current.next = null; // Desconectar

            Contact data = (Contact) current.getData();
            if (data.notReadMessages > 0) {
                withMessages.addContact(data.name, data.notReadMessages);
            } else {
                notMessages.addContact(data.name, data.notReadMessages);
            }
            current = next;
        }
        this.head = null; // La lista original se vacía
        return new ContactList[]{withMessages, notMessages};
    }

    public void showContacts() {
        Node<Contact> current = this.head;
        if (current == null) {
            System.out.println("No hay contactos.");
            return;
        }
        while (current != null) {
            Contact data = (Contact) current.getData();

            System.out.println("Contacto: " + data.name + ", Mensajes no leídos: " + data.notReadMessages);
            current = current.next;
        }
    }
}
