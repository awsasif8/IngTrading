package com.hcl.IngTradingApp.service;

import com.hcl.IngTradingApp.Dto.ConfirmResponse;
import com.hcl.IngTradingApp.Dto.TradingDto;

public interface TradingService {

	ConfirmResponse confirm(TradingDto tradingDto);

	String verify(Long tradingDto);

}
