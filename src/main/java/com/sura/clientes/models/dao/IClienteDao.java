package com.sura.clientes.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.sura.clientes.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
