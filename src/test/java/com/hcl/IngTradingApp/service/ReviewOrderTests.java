package com.hcl.IngTradingApp.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.hcl.IngTradingApp.dto.PurchaseDto;
import com.hcl.IngTradingApp.dto.PurchaseResponse;
import com.hcl.IngTradingApp.entity.Stocks;
import com.hcl.IngTradingApp.repository.PurchaseRepository;
import com.hcl.IngTradingApp.repository.StockRepository;


@RunWith(MockitoJUnitRunner.class)
public class ReviewOrderTests {
	
	
	@Mock
	PurchaseRepository puchaseRepository;
	
	@Mock
	StockRepository stockRepository;
	
	@InjectMocks
	ReviewPurchaseImpl purchaseServiceImpl;
	
	@Test
	public void testReviewOrder() {
		
		Stocks stock=new Stocks();
		stock.setNumberOfStocks(200);
		stock.setStandardPrice(200.0);
		stock.setMarketPrice(350.0);
		PurchaseDto dto=new PurchaseDto();
		dto.setStockId(1L);
		dto.setUserid(2L);
		dto.setVolumeofstock(100);
		
		
        Mockito.when(stockRepository.findByStockId(dto.getStockId())).thenReturn(stock);
        
       PurchaseResponse response=purchaseServiceImpl.purchaseOrder(dto);
         System.out.println(response);
		      Assert.assertEquals("purchase to order confirm or Cancel", response.getMessage());
		
	}
	
	
	@Test
	public void testCancelOrder() {
		
		purchaseServiceImpl.cancelOrder(1L, 1L);
		
		
		
	}

}
