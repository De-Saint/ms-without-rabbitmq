package com.stlemmy.currencyexchangeservice.controller;

import com.stlemmy.currencyexchangeservice.entity.ExchangeEntity;
import com.stlemmy.currencyexchangeservice.service.ExchangeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/exchange")
@RefreshScope
public class ExchangeController {

    private Logger logger = LoggerFactory.getLogger(ExchangeController.class.getName());

    @Autowired
    private ExchangeService exchangeService;

    @Autowired
    private Environment environment;

    @GetMapping("/value/from/{from}/to/{to}")
    public ExchangeEntity getExchangeValue(@PathVariable String from, @PathVariable String to){
        logger.info("Getting the Exchange Value");
        ExchangeEntity exchangeEntity = exchangeService.findExchangeByFromAndTo(from, to);
        logger.info("Response from the Exchange Value {}" + exchangeEntity);
        exchangeEntity.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
        return exchangeEntity;
    }

}
