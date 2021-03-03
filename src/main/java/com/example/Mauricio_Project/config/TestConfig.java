package com.example.Mauricio_Project.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.Mauricio_Project.entities.Stock;
import com.example.Mauricio_Project.repositories.StockRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private StockRepository stockRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		

		Stock s1 = new Stock(1L,"PETROS");
		
		// Falta setar valor de quotes

	stockRepository.saveAll(Arrays.asList(s1));

}
}
