package com.phnbk.service;

import java.util.List;

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
		
		return null;
	}

	
	public Contact getContactById(Integer id) {
		
		return null;
	}

	
	public boolean updateContact(Contact c) {
		
		return false;
	}

	
	public boolean deleteContact(Integer id) {
		
		return false;
	}

	
	
}
