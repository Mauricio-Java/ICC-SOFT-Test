package com.example.Mauricio_Project.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Mauricio_Project.entities.Stock;
import com.example.Mauricio_Project.services.StockService;

@RestController
@RequestMapping(value = "/stocks")

public class StockResource {
	
	@Autowired
	private StockService service;
	
	@GetMapping
	public ResponseEntity<List<Stock>> findALL() {
		
		List<Stock> list = service.findALL();
		return ResponseEntity.ok().body(list);
	}
		//return ResponseEntity.ok().body(list);
		
		//Stock s = new Stock(1L,"PETROS");
		
		@GetMapping(value = "/{id}")
		public ResponseEntity<Stock> findById(@PathVariable Long id) {
			Stock obj = service.findById(id);
			return ResponseEntity.ok().body(obj);
		
	}
}
	
	


