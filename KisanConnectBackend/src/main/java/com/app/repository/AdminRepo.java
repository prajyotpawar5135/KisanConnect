package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojos.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Long> {
	Optional<Admin> findByUsernameAndPassword(String uname, String pass);
}
