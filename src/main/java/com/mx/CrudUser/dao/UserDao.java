package com.mx.CrudUser.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.CrudUser.dominio.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
