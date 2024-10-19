package com.phnbk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.phnbk.Entity.ContactEntity;
import com.phnbk.dto.Contact;
import com.phnbk.service.ContactService;

@Controller
public class ViewContactsController {
	
	@Autowired
	private ContactService contactService;
	
	
	  @RequestMapping("/editContact")
	  public String editContact(@RequestParam("cid") Integer contactId, Model model) {
		 Contact c = contactService.getContactById(contactId);
		 model.addAttribute("contact", c);
		 return "contactInfo";  
	  }

	  
	  public String updateContact(@ModelAttribute ContactEntity c, Model model) {
		
		  return null;  
	  }
	  
	  @RequestMapping("/deleteContact")
	  public String deleteContact(@RequestParam("cid") Integer id) {
		  boolean isDeleted = contactService.deleteContact(id);
		  if(isDeleted) {
			  return "redirect:/viewContacts";
		  }
		  return null;
	  }
}
