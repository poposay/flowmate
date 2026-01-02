package com.example.flowmate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.flowmate.entity.Client;
import com.example.flowmate.service.ClientService;

@Controller
@RequestMapping("/clients")
public class ClientController {
	
	private final ClientService clientService;
	
	public ClientController(ClientService clientService) {
		this.clientService = clientService;
	}
	
	@GetMapping
	public String list(Model model) {
		model.addAttribute("clients", clientService.readAll());
		return "clients/list";
	}

	
	
	

}
