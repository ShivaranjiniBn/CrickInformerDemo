package com.crick.apis.service;

import java.util.List;

import com.crick.apis.entity.Match;


public interface MatchService {
	
	//get all matches
	List<Match> getAllMatches();
	
	//get live matches
	List<Match> getLiveMatches();
	
	//get point table 2023
	List<List<String>> getPointTable();

}
