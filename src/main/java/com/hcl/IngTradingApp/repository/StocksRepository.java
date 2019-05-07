package com.hcl.IngTradingApp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.IngTradingApp.entity.Stocks;

@Repository
public interface StocksRepository extends JpaRepository<Stocks, Long>{

	public Stocks findByStockId(Long stockId);
}
