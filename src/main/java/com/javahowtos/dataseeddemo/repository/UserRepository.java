package com.javahowtos.dataseeddemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.javahowtos.dataseeddemo.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
