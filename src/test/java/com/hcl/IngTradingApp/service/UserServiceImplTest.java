package com.hcl.IngTradingApp.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.hcl.IngTradingApp.dto.StockDto;
import com.hcl.IngTradingApp.dto.StockListDto;
import com.hcl.IngTradingApp.dto.UserDto;
import com.hcl.IngTradingApp.entity.Stocks;
import com.hcl.IngTradingApp.entity.User;
import com.hcl.IngTradingApp.repository.StockRepository;
import com.hcl.IngTradingApp.repository.UserRepository;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest {
	
	@InjectMocks
	UserServiceImpl userServiceImpl;
	@Mock
	UserRepository userRepository;
	
	@InjectMocks
	StockServiceImpl stockServiceImpl;
	@Mock
	StockRepository stockRepository;
	
	@Test
	public void testUsers() {
		
		List<User> users=new ArrayList<User>();		
		User user=new User();		
		user.setUserName("HariPriya");
		users.add(user);
		
		List<UserDto> usersDtoLists=new ArrayList<UserDto>();		
		UserDto userDto=new UserDto();		
		userDto.setUserName("HariPriya");
		usersDtoLists.add(userDto);
		
		Mockito.when(userRepository.findAll()).thenReturn(users);
		
		List<UserDto> response=userServiceImpl.getUsersList();
		
		
	   Assert.assertEquals(usersDtoLists.size(), response.size());
	
		
	
	}
	
	@Test
	public void testStocks() {
		
		List<Stocks> stocksLists=new ArrayList<Stocks>();		
		Stocks stocks=new Stocks();		
		stocks.setCompanyName("AAA");
		stocks.setNumberOfStocks(500);
		stocks.setStandardPrice(5000.00);
		stocksLists.add(stocks);
		
		List<StockDto> stocksDtoLists=new ArrayList<StockDto>();		
		StockDto stockDto=new StockDto();		
		stockDto.setCompanyName("AAA");
		stockDto.setNumberOfStocks(500);
		stockDto.setStandardPrice(5000.00);
		stocksDtoLists.add(stockDto);
		
		Mockito.when(stockRepository.findAll()).thenReturn(stocksLists);
		
		List<StockListDto> response=stockServiceImpl.getStocksList();
		
		
	   Assert.assertEquals(stocksDtoLists.size(), response.size());
	
		
	
	}


}
