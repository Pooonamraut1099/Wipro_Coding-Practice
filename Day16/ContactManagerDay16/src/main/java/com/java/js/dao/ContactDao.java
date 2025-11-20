package com.java.js.dao;

import java.util.ArrayList;
import java.util.List;

import com.java.js.model.Contact;

public class ContactDao {
	private static List<Contact> contacts = new ArrayList<>();
    private static int idCounter = 1;

    public void addContact(String name, String phone, String email) {
        contacts.add(new Contact(idCounter++, name, phone, email));
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public Contact getContactById(int id) {
        return contacts.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }

    public void updateContact(int id, String name, String phone, String email) {
        Contact c = getContactById(id);
        if (c != null) {
            c.setName(name);
            c.setPhone(phone);
            c.setEmail(email);
        }
    }

    public void deleteContact(int id) {
        contacts.removeIf(c -> c.getId() == id);
    }

    public List<Contact> searchByName(String name) {
        List<Contact> result = new ArrayList<>();
        for (Contact c : contacts) {
            if (c.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(c);
            }
        }
        return result;
    }
}
