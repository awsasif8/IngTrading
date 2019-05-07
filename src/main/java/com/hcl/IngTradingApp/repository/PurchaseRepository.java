package com.hcl.IngTradingApp.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import com.hcl.IngTradingApp.entity.PurchaseInfo;

@Repository

public interface PurchaseRepository  extends JpaRepository<PurchaseInfo, Long>{

	
	//@Query(value="delete from PurchaseInfo e where e.stockId=:stockid and e.userid=:userid ")
	//public void deleteCancelOrder(@Param(value="stockid") Long stockid, @Param(value="userid") Long userid);

    @Modifying
    @Transactional
    void deleteByStockIdAndUserid(Long stockid,Long userId);

}