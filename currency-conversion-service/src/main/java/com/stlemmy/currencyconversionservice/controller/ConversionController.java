package com.stlemmy.currencyconversionservice.controller;

import com.stlemmy.currencyconversionservice.entity.ConversionEntity;
import com.stlemmy.currencyconversionservice.proxy.ExchangeServiceProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/conversion")
@RefreshScope
public class ConversionController {

    private Logger logger = LoggerFactory.getLogger(ConversionController.class.getName());


    @Autowired
    ExchangeServiceProxy exchangeServiceProxy;


    @GetMapping("/value/from/{from}/to/{to}/quantity/{quantity}")
    public ConversionEntity getConversionAmount(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {
        logger.info("Connecting thru feign to the Exchange Service");
        ConversionEntity conversionEntityResponse = exchangeServiceProxy.getExchangeValue(from, to);
        logger.info("Response from the Exchange Service {}" + conversionEntityResponse);
        return new ConversionEntity(conversionEntityResponse.getId(), from, to, conversionEntityResponse.getConversionvalue(), quantity
                , quantity.multiply(conversionEntityResponse.getConversionvalue()), conversionEntityResponse.getPort());

    }


}
