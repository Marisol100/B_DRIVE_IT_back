package com.mx.CrudUser.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.CrudUser.dao.UserDao;
import com.mx.CrudUser.dominio.User;

@Service
public class UserServImp implements UserServ {

	@Autowired
	UserDao userDao;

	@Override
	public void guardar(User user) {
		// TODO Auto-generated method stub
		userDao.save(user);
	}

	@Override
	public void editar(User user) {
		// TODO Auto-generated method stub
		userDao.save(user);
	}

	@Override
	public void eliminar(User user) {
		// TODO Auto-generated method stub
		userDao.delete(user);
	}

	@Override
	public User buscar(User user) {
		// TODO Auto-generated method stub
		return userDao.findById(user.getUser_id()).orElse(null);
	}

	@Override
	public List<User> listar() {
		// TODO Auto-generated method stub
		return (List<User>) userDao.findAll();
	}

}
