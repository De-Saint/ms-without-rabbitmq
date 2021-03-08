package com.stlemmy.currencyexchangeservice.service;

import com.stlemmy.currencyexchangeservice.entity.ExchangeEntity;
import com.stlemmy.currencyexchangeservice.repository.ExchangeRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Service
public class ExchangeService {
    private Logger logger = LoggerFactory.getLogger(ExchangeService.class.getName());
    @Autowired
    private ExchangeRepository exchangeRepository;

    public ExchangeEntity findExchangeByFromAndTo(String from, String to) {
        logger.info("Getting the Exchange Value By From and To");
        return exchangeRepository.findByFromAndTo(from, to);
    }
}
