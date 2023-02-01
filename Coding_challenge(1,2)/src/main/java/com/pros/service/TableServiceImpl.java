package com.pros.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pros.model.Table;
import com.pros.repo.TableRepo;

@Service
public class TableServiceImpl implements TableService{
	
	@Autowired
	private TableRepo dao;

	@Override
	public List<List<String>> getTitleAndDescriptionByCategory(String category) {
		List<List<String>> result= dao.getTitleAndDescriptionByCategory(category);
		
		return result;
	}

	@Override
	public String saveNewEntry(Table t) {
		 dao.save(t);
		
		return "New Entry saved successfully!";
	}

}
