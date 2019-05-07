package com.hcl.IngTradingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.IngTradingApp.entity.PurchaseInfo;

@Repository
public interface PurchaseRepository  extends JpaRepository<PurchaseInfo, Long>{

}
