package com.hcl.IngTradingApp.service;

import com.hcl.IngTradingApp.dto.ConfirmResponse;
import com.hcl.IngTradingApp.dto.TradingDto;

public interface TradingService {

	ConfirmResponse confirm(TradingDto tradingDto);

	String verify(Long tradingDto);

}
