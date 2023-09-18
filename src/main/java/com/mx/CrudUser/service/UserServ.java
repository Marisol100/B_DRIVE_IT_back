package com.mx.CrudUser.service;

import java.util.List;

import com.mx.CrudUser.dominio.User;

public interface UserServ {

	public void guardar(User user);

	public void editar(User user);

	public void eliminar(User user);

	public User buscar(User user);

	public List<User> listar();

}
