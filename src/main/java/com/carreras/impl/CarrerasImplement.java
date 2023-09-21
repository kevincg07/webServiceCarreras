package com.carreras.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.persistence_escuela.entity.Carreras;
import com.persistence_escuela.repository.CarrerasRepository;
import com.persistence_escuela.request.CarrerasRequest;

import comcarreras.service.CarrerasService;

@Service
public class CarrerasImplement implements CarrerasService{
	
	@Autowired
	CarrerasRepository repo;

	@Override
	public Carreras guardar(CarrerasRequest request) {
		Carreras c = new Carreras();
		c.setNombre(request.getNombre());
		c.setDuracion(request.getDuracion());
		repo.save(c);
		return c;
	}

	@Override
	public Carreras actualizar(CarrerasRequest request) {
		Carreras c = repo.findById(request.getIdCarrera()).get();
		c.setNombre(request.getNombre());
		c.setDuracion(request.getDuracion());
		repo.save(c);
		return c;
	}

	@Override
	public Carreras buscar(int id) {
		
		return repo.findById(id).get();
	}

	@Override
	public Carreras buscar(String name) {
		
		return repo.findByName(name).get();
	}

	@Override
	public String borrar(int id) {
		repo.deleteById(id);
		return "Borrado";
	}

	@Override
	public List mostrar() {
		
		return repo.findAll();
	}

}
