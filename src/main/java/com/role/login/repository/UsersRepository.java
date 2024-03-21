package com.role.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.role.login.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Long>{

}
