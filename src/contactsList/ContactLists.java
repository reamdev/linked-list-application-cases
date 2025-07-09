/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contactsList;

/**
 *
 * @author ream_
 */
public class ContactLists {

    public static void main(String[] args) {
        ContactList lista = new ContactList();
        lista.addContact("Ana", 3);
        lista.addContact("Bob", 0);
        lista.addContact("Clara", 2);
        lista.addContact("David", 0);
        System.out.println("Contactos originales:");
        lista.showContacts();
        System.out.println("Particionando por mensajes no leídos...");
        ContactList[] particionadas = lista.particionarPorMensajes();
        System.out.println("Contactos con mensajes no leídos:");
        particionadas[0].showContacts();
        System.out.println("Contactos sin mensajes no leídos:");
        particionadas[1].showContacts();
    }
}
