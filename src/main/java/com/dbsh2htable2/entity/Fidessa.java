package com.dbsh2htable2.entity;



import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="FID")
public class Fidessa {

	/*
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="empid")
	private long empId;
	@Column(name="empname")
	private String empName;
	@Column(name="empemail")
	private String email;

	TRADE_ID,STOCK_NAME,ISIN,QUANTITY,BS_IND,PRICE,EXCHANGE,DAY_NUM

	*/

    @Id
    private Long id;

    @Column(name="TRADE_ID")
    private String tradeId;
    @Column(name="STOCK_NAME")
    private String stockName;
    @Column(name="ISIN")
    private String isin;
    @Column(name="QUANTITY")
    private Long quantity;
    @Column(name="BS_IND")
    private String buySellIndicator;
    @Column(name="PRICE")
    private Double price;

    public int getDayNum() {
        return dayNum;
    }

    public void setDayNum(int dayNum) {
        this.dayNum = dayNum;
    }

    @Column(name="EXCHANGE")
    private String exchange;
    @Column(name="DAY_NUM")
    private int dayNum;




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getBuySellIndicator() {
        return buySellIndicator;
    }

    public void setBuySellIndicator(String buySellIndicator) {
        this.buySellIndicator = buySellIndicator;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }


}
