package com.crick.apis.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crick.apis.entity.Match;

public interface MatchRepo extends JpaRepository<Match, Integer>{
	
	//provide team heading/name
	Optional<Match> findByteamHeading(String teamHeading);

}
