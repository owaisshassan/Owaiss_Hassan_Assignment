package com.pros.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pros.model.Table;

@Repository
public interface TableRepo extends JpaRepository<Table, Integer>{

	@Query("select title, description from table where category = :cat")
	public List<List<String>> getTitleAndDescriptionByCategory(@Param("cat") String category);
}
