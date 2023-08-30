package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojos.Farmer;

@Repository
public interface FarmerRepo extends JpaRepository<Farmer, Long> {
	Optional<Farmer> findByUsernameAndPassword(String uame, String password);
}
