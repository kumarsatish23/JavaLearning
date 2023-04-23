package com.vanna.jpa.Namedquery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vanna.jpa.Namedquery.Entity.City;



@Repository
public interface DAO extends JpaRepository<City, Long> {

	List<City> findAllOrdByNameDesc();

}
