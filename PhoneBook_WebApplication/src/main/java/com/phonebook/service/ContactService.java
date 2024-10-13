package com.phonebook.service;

import java.util.List;

import com.phonebook.entity.ContactEntity;

public interface ContactService {
	
	boolean saveContact(ContactEntity c);
	List<ContactEntity> getAllContacts();
	ContactEntity getContactById(Integer id);
	boolean updateContact(ContactEntity c);
	boolean deleteContact(Integer id);
}
