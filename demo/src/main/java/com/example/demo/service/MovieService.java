package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Movie;




@Service
public class MovieService {

	private String mainUrl="https://www.omdbapi.com/?t=";
	private String key="&apikey=4ef3dcaa";
	
	
	@Autowired
	RestTemplate restTemplate;
	
	public Object getMovie(String name) {
		String url=mainUrl+name+key;
		return restTemplate.getForEntity(url, Object.class);
	
	}
	
	

	

}
