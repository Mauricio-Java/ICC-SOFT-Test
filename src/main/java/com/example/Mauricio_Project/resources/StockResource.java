package com.example.Mauricio_Project.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Mauricio_Project.entities.Stock;

@RestController
@RequestMapping(value = "/stocks")

public class StockResource {
	
	@GetMapping
	public ResponseEntity<Stock> findALL() {
		
		Stock s = new Stock(1L,"PETROS");
		return ResponseEntity.ok().body(s);
		
		
	}
}
	
	


