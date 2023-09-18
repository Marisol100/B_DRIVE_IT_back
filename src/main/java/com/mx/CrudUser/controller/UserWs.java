package com.mx.CrudUser.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudUser.dominio.User;
import com.mx.CrudUser.service.UserServImp;

@RestController
@RequestMapping("UserWs")
@CrossOrigin
public class UserWs {

	@Autowired
	UserServImp userServImp;

	// http://localhost/UserWs/listar
	@GetMapping("listar")
	public List<User> listar() {
		return userServImp.listar();
	}

	// http://localhost/UserWs/guardar
	// Guardar
	@PostMapping("guardar")
	public ResponseEntity<String> guardar(@RequestBody User user) {
		userServImp.guardar(user);
		return new ResponseEntity<String>("Se guardo correctamente el usuario", HttpStatus.OK);
	}

	// http://localhost/UserWs/editar
	// Editar
	@PostMapping("editar")
	public ResponseEntity<String> editar(@RequestBody User user) {
		userServImp.editar(user);
		return new ResponseEntity<String>("Se edito correctamente el usuario", HttpStatus.OK);
	}

	// http://localhost/UserWs/eliminar
	// Eliminar
	@PostMapping("eliminar")
	public ResponseEntity<String> eliminar(@RequestBody User user) {
		userServImp.eliminar(user);
		return new ResponseEntity<String>("Se eliminó correctamente el usuario", HttpStatus.OK);
	}

	// http://localhost/UserWs/buscar
	// Buscar
	@PostMapping("buscar")
	public User buscar(@RequestBody User user) {
		return userServImp.buscar(user);
	}

}
