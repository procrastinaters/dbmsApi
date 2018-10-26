package com.stock.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StockInfo {

    private Integer StockIndex;
    private String Symbol;
    private String  Series;
    private String date;
    private Double prevClose;
    private Double openPrice;
    private Double  High_Price;
    private Double Low_Price;
    private Double Last_Price;
    private Double  Close_Price;
    private Double Average_Price;
    private Integer Total_Traded_Quantity;
    private Double Turnover;
    private Integer No_of_Trades;
    private Integer Deliverable_Qty;
    private Double _Dly_Qt_to_Traded_Qty;

    public StockInfo(){}

    public StockInfo(Integer StockIndex,
             String Symbol,
             String  Series,
             String date,
             Double prevClose,
             Double openPrice,
             Double  High_Price,
             Double Low_Price,
             Double Last_Price,
             Double  Close_Price,
             Double Average_Price,
             Integer Total_Traded_Quantity,
             Double Turnover,
             Integer No_of_Trades,
             Integer Deliverable_Qty,
             Double _Dly_Qt_to_Traded_Qty) {
        this.StockIndex = StockIndex;
        this.Symbol = Symbol;
        this.Series = Series;
        this.date = date;
        this.prevClose = prevClose;
        this.openPrice = openPrice;
        this.High_Price = High_Price;
        this.Low_Price = Low_Price;
        this.Last_Price = Last_Price;
        this.Close_Price = Close_Price;
        this.Average_Price = Average_Price;
        this.Total_Traded_Quantity = Total_Traded_Quantity;
        this.Turnover = Turnover;
        this.No_of_Trades = No_of_Trades;
        this.Deliverable_Qty = Deliverable_Qty;
        this._Dly_Qt_to_Traded_Qty = _Dly_Qt_to_Traded_Qty;


    }

    public Integer getStockIndex() {
        return StockIndex;
    }

    public String getTicker() { return Symbol; }

    public String getSeries() {
        return Series;
    }

    public String getDate() {
        return date;
    }

    public Double getPrevClose() {
        return prevClose;
    }

    public Double getOpenPrice() {
        return openPrice;
    }

    public Double get_High_Price() { return High_Price; }

    public Double get_Low_Price() {
        return Low_Price;
    }

    public Double get_Last_Price() {
        return Last_Price;
    }

    public Double get_Close_Price() {
        return Close_Price;
    }

    public Double get_Average_Price() {
        return Average_Price;
    }

    public Integer get_Total_Traded_Quantity() {
        return Total_Traded_Quantity;
    }

    public Double get_Turnover() {
        return Turnover;
    }

    public Integer get_No_of_Trades() {
        return No_of_Trades;
    }

    public Integer get_Deliverable_Qty() {
        return Deliverable_Qty;
    }

    public Double get_Dly_Qt_to_Traded_Qty() {
        return _Dly_Qt_to_Traded_Qty;
    }



}
