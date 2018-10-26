package com.stock.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Stock {

    private String symbol;
    private String companyName;
    private String primaryExchange;
    private String sector;
    private Double open;
    private Float close;
    private Float previousClose;
    private Float latestPrice;
    private Double changePercent;

    public Stock(){}

    public Stock(String symbol,
                 String companyName,
                 String primaryExchange,
                 String sector,
                 Double open,
                 Float close,
                 Float previousClose,
                 Float latestPrice,
                 Double changePercent) {
        this.symbol = symbol;
        this.companyName = companyName;
        this.primaryExchange = primaryExchange;
        this.sector = sector;
        this.open = open;
        this.close = close;
        this.previousClose = previousClose;
        this.latestPrice = latestPrice;
        this.changePercent = changePercent;
    }

    public String getCompanyName() {
        return companyName;
    }


    public String getPrimaryExchange() {
        return primaryExchange;
    }


    public String getSector() {
        return sector;
    }


    public Double getOpen() {
        return open;
    }


    public Float getClose() {
        return close;
    }


    public Float getLatestPrice() {
        return latestPrice;
    }

    public Double getChangePercent() {
        return changePercent;
    }


    public String getSymbol() {
        return symbol;
    }

    public Float getPreviousClose() {
        return previousClose;
    }
}
