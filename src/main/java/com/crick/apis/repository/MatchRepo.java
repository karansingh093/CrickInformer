package com.crick.apis.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crick.apis.entities.Match;

public interface MatchRepo extends JpaRepository<Match,Integer> {
	
	// match fetch karna chahta hoon
	// provide kar de --> teamHeading(Team name like IND V/S AUS)

	 Optional<Match> findByTeamHeading(String teamHeading);

}
