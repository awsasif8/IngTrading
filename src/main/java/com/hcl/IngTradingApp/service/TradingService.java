package com.hcl.IngTradingApp.service;

import com.hcl.IngTradingApp.dto.ConfirmResponse;
import com.hcl.IngTradingApp.dto.TradingDTO;

public interface TradingService {

	ConfirmResponse confirm(TradingDTO tradingDto);

	String verify(Long tradingDto);

}
