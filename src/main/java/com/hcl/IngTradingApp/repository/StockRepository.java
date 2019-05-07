package com.hcl.IngTradingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.IngTradingApp.entity.Stocks;

public interface StockRepository extends JpaRepository<Stocks, Long> {
	
	public Stocks findByStockId(Long stockId);

}
