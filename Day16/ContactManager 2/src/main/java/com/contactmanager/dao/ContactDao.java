package com.contactmanager.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.contactmanager.model.Contact;

public class ContactDao {

    private static final List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public List<Contact> getAllContacts() {
        return Collections.unmodifiableList(contacts);
    }
}
