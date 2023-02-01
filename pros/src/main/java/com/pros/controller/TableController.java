package com.pros.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pros.model.Table;
import com.pros.service.TableService;

@RestController
@RequestMapping("/table")
public class TableController {
	
	@Autowired
	private TableService service;
	
	
	/*Create an API that lists the title, description based on the 
			category passed as an input parameter.*/
	
	@GetMapping("/title/description/{category}")
	public ResponseEntity<List<List<String>>> getTitleAndDescriptionHandler
			(@PathVariable("category") String category){
		
		List<List<String>> result= service.getTitleAndDescriptionByCategory(category);
		
		return new ResponseEntity<List<List<String>>>(result, HttpStatus.OK);
	}
	
	
	/*Create an API that would save a new entry with all the relevant properties 
	 * 	which retrieves values from the endpoint GET /entries */
	
	@PostMapping("/save")
	public ResponseEntity<String> saveNewEntryHandler(@RequestBody Table t){
		
		String savedEntry= service.saveNewEntry(t);
		
		return new ResponseEntity<String>(savedEntry, HttpStatus.CREATED);
	}
	


}
