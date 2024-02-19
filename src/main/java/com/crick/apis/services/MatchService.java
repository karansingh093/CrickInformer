package com.crick.apis.services;

import java.util.List;
import java.util.Map;

import com.crick.apis.entities.Match;

public interface MatchService {

	// get all matches
	List<Match> getAllMatches();
	
	// get live matches
	List<Match> getLiveMatches();
	
	// get cricket world cup 2024 point table
	List<List<String>> getPointTable();
	
}
