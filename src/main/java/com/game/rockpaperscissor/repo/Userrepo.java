package com.game.rockpaperscissor.repo;

import com.game.rockpaperscissor.model.user;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Userrepo extends JpaRepository<user,Integer> {

    Optional<user> findByName(String name);
}
