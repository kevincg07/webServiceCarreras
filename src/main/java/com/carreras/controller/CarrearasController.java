package com.carreras.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carreras.impl.CarrerasImplement;
import com.persistence_escuela.entity.Carreras;
import com.persistence_escuela.request.CarrerasRequest;


@RestController
@RequestMapping("carreras/")
public class CarrearasController {

	@Autowired
	CarrerasImplement logic;
	
	@PostMapping
	ResponseEntity<Carreras> guardar(@RequestBody CarrerasRequest request){
		Carreras c = logic.guardar(request);
		return new ResponseEntity<Carreras>(c, HttpStatus.OK);
	}
	
	@PutMapping
	ResponseEntity<Carreras> actualizar(@RequestBody CarrerasRequest request){
		Carreras c = logic.actualizar(request);
		return new ResponseEntity<Carreras>(c, HttpStatus.OK);
	}
	
	@GetMapping("buscar-por-id/{id}")
	ResponseEntity<Carreras> buscar(@PathVariable int id){
		Carreras c = logic.buscar(id);
		return new ResponseEntity<Carreras>(c, HttpStatus.OK);
	}
	
	@GetMapping("buscar-por-nombre/{name}")
	ResponseEntity<Carreras> buscar(@PathVariable String name){
		Carreras c = logic.buscar(name);
		return new ResponseEntity<Carreras>(c, HttpStatus.OK);
	}
	
	@GetMapping
	ResponseEntity<List<Carreras>> mostrar(){
		List<Carreras> carreras = logic.mostrar();
		return new ResponseEntity<List<Carreras>>(carreras, HttpStatus.OK);
	}
	
	@DeleteMapping("eliminar/{id}")
	ResponseEntity<String> eliminar(@PathVariable int id){
		String m = logic.borrar(id);
		return new ResponseEntity<String>(m, HttpStatus.OK);
	}
}
