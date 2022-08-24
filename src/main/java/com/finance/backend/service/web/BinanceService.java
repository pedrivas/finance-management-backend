package com.finance.backend.service.web;

import com.finance.backend.service.web.model.BinancePriceResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

public class BinanceService {

    @Value("${binance.api.url}")
    private String baseUrl;

    private final RestTemplate restTemplate;

    public BinanceService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public BinancePriceResponse getPrice(String symbol) {

        String url = String.format("%s/ticker/price?symbol=%s", baseUrl, symbol);
        return restTemplate.getForObject(url, BinancePriceResponse.class);

    }
}
