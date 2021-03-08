package com.stlemmy.currencyexchangeservice.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity(name = "Exchange")
public class ExchangeEntity {

    @Id
    private Long id;

    @Column(name = "currency_from")
    private String from;

    @Column(name = "currency_to")
    private String to;

    @Column(name = "conversion_value")
    private BigDecimal conversionvalue;

    private int port;

    public ExchangeEntity() {
    }

    public ExchangeEntity(Long id, String from, String to, BigDecimal conversionvalue) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionvalue = conversionvalue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversionvalue() {
        return conversionvalue;
    }

    public void setConversionvalue(BigDecimal conversionvalue) {
        this.conversionvalue = conversionvalue;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "ExchangeEntity{" +
                "id=" + id +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", conversionvalue=" + conversionvalue +
                ", port=" + port +
                '}';
    }
}
