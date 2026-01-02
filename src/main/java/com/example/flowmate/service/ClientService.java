package com.example.flowmate.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.flowmate.entity.Client;
import com.example.flowmate.exception.ClientNotFoundException;
import com.example.flowmate.repository.ClientRepository;

import jakarta.transaction.Transactional;

@Service
public class ClientService {
	
	private final ClientRepository clientRepository;
	
	public ClientService(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}
	
	@Transactional
	public Client create(Client client) {
		return clientRepository.save(client);
	}
	
	public List<Client> readAll() {
		return clientRepository.findAll();
	}

	public Client readById(Long id) {
		return clientRepository.findById(id)
				.orElseThrow(() -> new ClientNotFoundException(id));
	}
	
	@Transactional
	public Client update(Client afterClient) {
		Client beforeClient = clientRepository.findById(afterClient.getId())
				.orElseThrow(() -> new ClientNotFoundException(afterClient.getId()));
		
		beforeClient.setName(afterClient.getName());
		beforeClient.setEmail(afterClient.getEmail());
		beforeClient.setNote(afterClient.getNote());
		
		return clientRepository.save(beforeClient);	
	}
	
	@Transactional
	public void delete(Long id) {
		Client target = clientRepository.findById(id)
				.orElseThrow(() -> new ClientNotFoundException(id));
		clientRepository.delete(target);
		
	}
}
