package com.vijay.book_movie_ticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vijay.book_movie_ticket.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	void deleteByRole(String string);
	boolean existsByEmail(String email);
}
