package com.sura.clientes.controllers;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sura.clientes.models.entity.Cliente;
import com.sura.clientes.models.services.IClienteService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/ExamenRest")
public class ClienteRestController {
	

	@Autowired
	private IClienteService clienteService;

	@GetMapping("/Producto")
	public List<Cliente> index() {
		return clienteService.findAll();
	}

	@GetMapping("/Producto/{id}")
	public Cliente show(@PathVariable Long id) {
		return this.clienteService.findById(id);
	}

	@PostMapping("/Producto")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente create(@RequestBody Cliente cliente) {
		this.clienteService.save(cliente);
		return cliente;
	}

	@PutMapping("/Producto/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente update(@RequestBody Cliente cliente, @PathVariable Long id) {
		Cliente currentCliente = this.clienteService.findById(id);
		currentCliente.setId(cliente.getId());
		currentCliente.setNombre(cliente.getNombre());
		currentCliente.setPrecio(cliente.getPrecio());
		currentCliente.setCantalmacen(cliente.getCantalmacen());
		currentCliente.setFechaCaducidad(cliente.getFechaCaducidad());
		this.clienteService.save(currentCliente);
		return currentCliente;
	}

	@DeleteMapping("/Producto/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		Cliente currentCliente = this.clienteService.findById(id);
		this.clienteService.delete(currentCliente);
	}

}
