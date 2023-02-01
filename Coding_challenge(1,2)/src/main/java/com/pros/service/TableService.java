package com.pros.service;

import java.util.List;


import com.pros.model.Table;


public interface TableService {
	
	public List<List<String>> getTitleAndDescriptionByCategory(String category);
	
	public String saveNewEntry(Table t);
}
