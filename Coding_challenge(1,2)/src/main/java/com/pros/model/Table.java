package com.pros.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Table {
	
	private String title;
	
	private String description;
	
	private String auth;
	
	private boolean https;
	
	private String cors;
	
	private String category;
	
	
}
