package com.stlemmy.currencyconversionservice.entity;


import java.math.BigDecimal;

public class ConversionEntity {

    private Long id;

    private String from;

    private String to;

    private BigDecimal conversionvalue;

    private  BigDecimal quantity;

    private BigDecimal totalamount;

    private int port;

    public ConversionEntity() {
    }

    public ConversionEntity(Long id, String from, String to, BigDecimal conversionvalue, BigDecimal quantity, BigDecimal totalamount, int port) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionvalue = conversionvalue;
        this.quantity = quantity;
        this.totalamount = totalamount;
        this.port = port;
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

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(BigDecimal totalamount) {
        this.totalamount = totalamount;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "ConversionEntity{" +
                "id=" + id +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", conversionvalue=" + conversionvalue +
                ", quantity=" + quantity +
                ", totalamount=" + totalamount +
                ", port=" + port +
                '}';
    }
}
