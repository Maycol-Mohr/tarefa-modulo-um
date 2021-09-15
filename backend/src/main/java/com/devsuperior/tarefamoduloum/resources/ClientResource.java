package com.devsuperior.tarefamoduloum.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.tarefamoduloum.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Ronaldo", "83726349512", 3800.00, Instant.now(), 4));
		list.add(new Client(2L, "Zaira", "83746528343", 4500.00, Instant.now(), 6));
		return ResponseEntity.ok().body(list);
	}

}
