package com.crick.apis.controller;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crick.apis.entity.Match;
import com.crick.apis.service.MatchService;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/match")
public class MatchController {
	
	
	 private MatchService matchService;

	public MatchController(MatchService matchService) {
		super();
		this.matchService = matchService;
	}

	@GetMapping("/live")
	    public ResponseEntity<?> getLiveMatchScores() throws InterruptedException {
	        System.out.println("getting live match");
	        return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);
	    }
	
	 @GetMapping("/point-table")
	    public ResponseEntity<?> getmatchPointTable() {
	        return new ResponseEntity<>(this.matchService.getPointTable(), HttpStatus.OK);
	    }

	    @GetMapping
	    public ResponseEntity<List<Match>> getAllMatches() {
	        return new ResponseEntity<>(this.matchService.getAllMatches(), HttpStatus.OK);
	    }

}
