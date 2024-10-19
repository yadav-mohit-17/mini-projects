package com.phnbk.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phnbk.Entity.ContactEntity;
import com.phnbk.dto.Contact;
import com.phnbk.repo.ContactDtlsRepository;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactDtlsRepository contactRepo;

	
	public boolean saveContact(Contact c) {
		ContactEntity entity = new ContactEntity();

		//convert dto object to entity object
		BeanUtils.copyProperties(c, entity);
		ContactEntity savedEntity=contactRepo.save(entity);
		return savedEntity.getContactId()!=null;
	}

	
	public List<Contact> getAllContacts() {
		List<ContactEntity> entities=contactRepo.findAll();
		
		//legacy approach
	/* List<Contact> contacts = new ArrayList<Contact>();	
	   for(ContactEntity entity : entities) {
			Contact contact = new Contact();
			BeanUtils.copyProperties(entity, contact);
			contacts.add(contact);;
		}
	*/	
		//java 8 approach
		return entities.stream().map(entity -> {
			Contact contact = new Contact();
			BeanUtils.copyProperties(entity, contact);
			return contact;
		}).collect(Collectors.toList());

	}

	
	public Contact getContactById(Integer id) {
		Optional<ContactEntity> findById=contactRepo.findById(id);
		if(findById.isPresent()) {
			ContactEntity entity = findById.get(); 
			Contact c = new Contact();
			BeanUtils.copyProperties(entity, c);
			return c;
		}
		return null;
	}

	
	public boolean updateContact(Contact c) {
		
		return false;
	}

	
	public boolean deleteContact(Integer id) {
		contactRepo.deleteById(id);
		return true;
	}

	
	
}
