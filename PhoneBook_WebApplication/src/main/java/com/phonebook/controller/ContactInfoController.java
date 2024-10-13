package com.phonebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.phonebook.entity.ContactEntity;
import com.phonebook.service.ContactService;

@Controller
public class ContactInfoController {
	
	@Autowired
	private ContactService contactService;

	@GetMapping(value= {"/","/addContact"})
	public String loadForm(Model model) {
		return null;
	}
	
	@PostMapping("/storeContact")
	public String handleSubmitBtn(ContactEntity c, Model model) {
		return null;
	}
	
	@GetMapping("/viewContacts")
	public String handleViewContactsLink(Model model) {
		return null;
	}
}
