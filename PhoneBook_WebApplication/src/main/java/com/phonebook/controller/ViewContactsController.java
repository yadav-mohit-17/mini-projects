package com.phonebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.phonebook.entity.ContactEntity;
import com.phonebook.service.ContactService;

@Controller
public class ViewContactsController {

	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/editContact")
	public String editContact(@RequestParam("id") Integer id) {
		return null;
	}
	
	@RequestMapping("/deleteContact")
	public String updateContact(@ModelAttribute ContactEntity c, Model model) {
		return null;
	}
	
	@RequestMapping("/deleteContact")
	public String deleteContact(@RequestParam("id") Integer id) {
		return null;
	}
	
}
