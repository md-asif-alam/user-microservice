package com.codewithasif.user.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithasif.user.service.entities.User;

public interface UserRepository extends JpaRepository<User, String> {

}
