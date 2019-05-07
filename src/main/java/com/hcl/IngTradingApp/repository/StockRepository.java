package com.hcl.IngTradingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.IngTradingApp.entity.Stocks;


@Repository
public interface StockRepository  extends JpaRepository<Stocks, Long>{

      public Stocks findByStockId(Long id);   
	
	
}
