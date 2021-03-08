package com.stlemmy.currencyconversionservice.proxy;

import com.stlemmy.currencyconversionservice.entity.ConversionEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "currency-exchange-service")
//@FeignClient(name = "currency-exchange-service", url = "localhost:8000")
public interface ExchangeServiceProxy {

    @GetMapping("exchange/value/from/{from}/to/{to}")
     ConversionEntity getExchangeValue(@PathVariable String from, @PathVariable  String to);
}
