package com.example.user.service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.user.service.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User,String> {

}
