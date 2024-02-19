package com.crick.apis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crick.apis.entities.Match;
import com.crick.apis.services.impl.MatchServiceImpl;

@RestController
@RequestMapping("/match")
@CrossOrigin("*")
public class MatchController {

	@Autowired
	private MatchServiceImpl matchServiceImpl;
	
	// get live matches
	@GetMapping("/live")
	public ResponseEntity<List<Match>> getLiveMatches(){
		
		return new ResponseEntity<>(this.matchServiceImpl.getLiveMatches(),HttpStatus.OK);
	}
	
	// get all matches
	@GetMapping
    public ResponseEntity<List<Match>> getAllMatches() {
        return new ResponseEntity<>(this.matchServiceImpl.getAllMatches(), HttpStatus.OK);
    }
	
	// get point table
	@GetMapping("/point-table")
    public ResponseEntity<?> getCWC2023PointTable() {
        return new ResponseEntity<>(this.matchServiceImpl.getPointTable(), HttpStatus.OK);
    }
}
