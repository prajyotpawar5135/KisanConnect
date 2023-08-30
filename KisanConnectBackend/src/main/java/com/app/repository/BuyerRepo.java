package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojos.Buyer;

@Repository
public interface BuyerRepo extends JpaRepository<Buyer, Long> {
	Optional<Buyer> findByUsernameAndPassword(String uname, String pass);
}
